const authMiddleware = require('../middlewares/auth');
const jwt = require('jsonwebtoken');

describe('Auth Middleware', () => {
  let req, res, next;

  beforeEach(() => {
    req = {
      headers: {}
    };
    res = {
      status: jest.fn().mockReturnThis(),
      json: jest.fn()
    };
    next = jest.fn();
  });

  it('deve passar com token válido', () => {
    const token = jwt.sign({ id: 1 }, process.env.JWT_SECRET);
    req.headers.authorization = `Bearer ${token}`;

    authMiddleware(req, res, next);

    expect(next).toHaveBeenCalled();
    expect(req.usuario).toHaveProperty('id', 1);
  });

  it('deve bloquear sem token', () => {
    authMiddleware(req, res, next);

    expect(res.status).toHaveBeenCalledWith(401);
  });
});