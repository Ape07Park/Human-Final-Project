import axios from 'axios';
import apiClient from './apiClient';



export const realTimeList = async () => {
  try {
    const response = await apiClient.get(`/ft/realTime/list`);;
    return response.data; 
  } catch (error) {
    console.log('답변 목록을 불러오는 중 에러:', error);
    throw error;
  }
};
