import axios from 'axios';

// 환경 변수에서 기본 URL 가져오기
const baseURL = process.env.REACT_APP_API_BASE_URL;

// Axios 인스턴스 생성
const apiClient = axios.create({
  baseURL,
  headers: {
    'Content-Type': 'application/json',
  },
});

export default apiClient;
