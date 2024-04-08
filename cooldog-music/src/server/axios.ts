import Axios from 'axios';

const axios = Axios.create({
  baseURL: '',
  timeout: 60000,
  cache: false,
  headers: {
    'Content-Type': 'application/json',
    'Cache-Control': 'no-cache',
  },
});
axios.interceptors.request.use(config => {
  delete config.headers['If-Modified-Since'];
  delete config.headers['If-None-Match'];
  return config;
})

export default axios;
