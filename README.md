# 가구 쇼핑몰 FURNiture
가구를 다루는 쇼핑몰 웹사이트입니다. 쇼핑몰의 일반적인 기능들에 직관적인 UI를 추가했습니다.
또한 관리자로 로그인 시 관리자를 위한 상품 추가, 회원 전체의 주문내역 보기, 통계 페이지 등을 제공합니다.

# FURNiture 영상
[![Video Label](https://i.ytimg.com/vi/MfuXneddQo8/hqdefault.jpg?sqp=-oaymwE2CPYBEIoBSFXyq4qpAygIARUAAIhCGAFwAcABBvABAfgBqgeAAtAFigIMCAAQARhlIGUoZTAP&rs=AOn4CLDRDGLgA1YnJaiYybY-sKx9lgljww)](https://www.youtube.com/watch?v=MfuXneddQo8)

# 프로젝트 기간
- 2024년 4월 16일 ~ 2024년 6월 14일

# 역할 분담
- 이강성: 상품, 리뷰, 문의의 기능과 결제(toss), 택배(DeliveryTracker), Karlo, cloudinary api, 통합, 배포
- 송햇님: 택배(스마트택배) API, 주문내역캘린더, 문의, 비회원주문, 개발자페이지, 하트 토글
- 정아름: 후기, 회원 주문, footer, ERD, 통계(상품 분석), 실시간 검색어
- 박성민: 주문, Firebase를 이용한 유저, 소셜로그인 기능과 RealtimeDB, Karlo, CoolSMS api, 배포
- 홍시표: 최근 상품, 장바구니와 관리자 분석, 통계 페이지, Azure api
- 김용현: 디자인, 유저인터페이스, 페이지 데이터 출력 기능 연결

# [1] 기술 스택
![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/5b77c38a-1026-4411-a1e4-659baab2391e)

# [2] 아키텍처
![아키텍쳐 drawio](https://github.com/Ape07Park/Human-Final-Project/assets/132667775/fd9907ed-339a-4555-9032-c205fa787aca)

# [3] 주요 기능
## 유저
- 회원가입
- 로그인
- 유저 마이페이지
- 유저 정보 수정
- 이메일로 비밀번호 변경
- SMS 아이디 찾기 및 비밀번호 변경

## 아이템
- 상품 리스트
- 리뷰
- 해시태그
- 검색
- 문의
- 세일

## 장바구니
- 상품 저장
- 구매 후 삭제

## 주문
- 결제
- 송장번호 조회
- 구매 내역
- 현재 배달 상태
  
## 관리자
- 상품 관리
- 문의내역 관리
- 주문 내역 관리
- 상품 통계

## api
- Firebase Authentication
- Firebase Realtime DB
- Cloudinary
- Toss
- DeliveryTracker
- Chart.js
- Karlo
- CoolSMS
- Azure

# [4] 업무 플로우
![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/56fda504-e0bf-4460-bc2c-1721d16251a0)

# [5] ERD
![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/1acb14e4-d903-44ff-9902-b30729a0a6ce)

# [6] API 명세
![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/3a5ba29d-a5d8-4643-9bef-6842265f0861)

# [7] 서비스 구성
## [1] 메인![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/cef4c586-bb21-4fd9-ac71-f3ec1e1889ee)

## [2] 로그인![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/91ddb2eb-a178-45bc-bf64-87185a219a79)

## [3] 회원가입![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/cd84c275-dca3-42fa-b113-e7758887eecc)

## [4] 회원정보![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/782563ef-7db7-495a-8111-96400f32e900)

## [5] 회원정보 수정![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/65902505-9ee6-4c7f-978f-b5806efb5235)

## [6] 아이템 검색 ![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/151fd74f-438e-454c-acf4-b25c796ca94c)

## [7] 아이템 상세![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/696c7589-d2a8-42e4-af03-e13360904132)

## [8] 아이템 리뷰![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/335d699d-c03a-43a6-8ba9-89f282658536)

## [9] 아이템 문의![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/4951ec35-07e9-4519-982c-1b932a7c39a9)

## [10] 장바구니![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/a63801af-51e0-4fa6-ae77-08238b58714b)

## [11] 주문![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/290f05a2-42b4-4367-a36a-df31e5e236dc)

## [12] 결재![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/96db6560-8e11-4ec0-8b79-729abfeccdb5)

## [12] 주문내역![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/74912a80-fb41-4922-8fa7-7ce305b7b5ee)


## [13] 아이템 정보(관리자)![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/cdf30b48-a3c6-47b0-a61f-ffa2c2f24f8f)


## [14] 문의 내역(관리자)![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/a9f3e171-849e-4229-aa28-dfce967c7ec8)


## [15] 전체 주문 내역(관리자)![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/06182462-31eb-4925-b5ac-02d84ed52a01)


## [16] 통계(관리자)![image](https://github.com/Ape07Park/Final-project-24.05-integralation/assets/132667775/7d210218-f211-41c0-907b-46da6030a680)






