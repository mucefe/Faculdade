import axios from 'axios';

const api = axios.create({
  baseURL: 'https://sua-api.com', 
  timeout: 5000
});

api.interceptors.request.use(config => {
  const token = localStorage.getItem('token');
  if (token) {
    config.headers.Authorization = `Bearer ${token}`;
  }
  return config;
});

export default api;
