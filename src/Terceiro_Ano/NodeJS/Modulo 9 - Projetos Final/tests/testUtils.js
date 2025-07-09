module.exports = {
  mockRequest: (body = {}, params = {}, query = {}, headers = {}) => ({
    body,
    params,
    query,
    headers
  }),
  mockResponse: () => {
    const res = {};
    res.status = jest.fn().mockReturnValue(res);
    res.json = jest.fn().mockReturnValue(res);
    return res;
  }
};