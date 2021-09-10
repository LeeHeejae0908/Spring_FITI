# WeFit

 팀 프로젝트 시작!!

 [21.08.31 : 주제정하기](#210831) <br>
 [21.09.01 : 메뉴 정하기 기능 회의](#21.09.01) <br>
 [21.09.02 : 와이어프레임 작성 및 기능설명 추가, 팀 이름 변경, 로고 작성, 디자인할 화면 분배, 일정잡기](#21.09.02) <br>
 [21.09.03 : html,css작업](#21.09.03) <br>
 [21.09.04 : html,css작업](#210904) <br>
 [21.09.05 : html,css작업](#21.09.05) <br>
 [21.09.06 : html,css작업](#21.09.06) <br>
 [21.09.07 : html,css작업](#21.09.07) <br>
 [21.09.08 : html,css작업](#21.09.08) <br>
 [21.09.09 : html,css작업 및 DB 모델링 회의](#21.09.09) <br>

#21.08.31
첫 팀회의 진행(비대면) <br>
참가자 : 김환서, 문예리, 신민주, 신수진, 이희재, 한민호<br>
## **회의주제** : 주제 정하기
## 세부내용
#### 각자 만들어보고 싶은 서비스 가져오기
- 간단한 쇼핑몰
- 제주도 내에서 사용할 수 있는 카풀 서비스
- 자전거 커뮤니티(자유게시판, 중고장터, 대회정보, 친구만남기능)
- 운동 커뮤니티'
- 1인가구를 타겟으로 한 동네위치기반 배달 배송
- 영화예매 사이트(자리 선택 예매)

## **결론**
### 주제 : 운동 커뮤니티로 정함
### 프로젝트명 : FITI로 함
### 메인기능 : 동네기반으로 같이 운동할 사람을 찾을 수 있는 기능
### ※ 깃 연동 연습해보기(commit, push, pull, pull request)
[▲맨위로](#wefit)


#21.09.01
두 번째 팀회의 진행(비대면) <br>
참가자 : 김환서, 문예리, 신민주, 신수진, 이희재, 한민호<br>
## 회의주제 : 메뉴 및 기능, UI크기회의
## 세부내용
#### 1. UI크기 PC크기 또는 모바일 크기
- PC: 디자인하기는 힘든데 코딩하기는 편할 것 같네요
- 모바일 : 디자인하기는 쉬운데 코딩하기는 어려움이 많을 것 같다
#### 결론 : 먼저 PC화면으로 구현을 해보고 시간이 남게 되면 모바일로도 해보자

#### 2. 메뉴
- 로그인(회원가입)/로그아웃(마이페이지)
- 운동 커뮤니티
  - 가까운 친구
  - 운동하기 좋은 장소
  - 중고거래
  - 구인구직
- 운동 팁
  - 운동강의
  - 식단/영양정보
- 자유 게시판
- 종목별 게시판

#### 3. 기능
- 실시간 위치기반으로 가까운 친구 만나기 
- 각 종목별 운동하기 좋은 위치? 
- 쇼핑기능! (중고거래 추가) 
- 운동 강의
- 로그인(이메일 로그인, 구글, 카카오, 네이버, 페북 로그인)
- 자유게시판
- 종목별 게시판(회원이 종목 추가)
- 휘트니스 구인/구직 
- 식이/영양정보
- 날씨 API, 다운로드 링크, 인바디 측정 -> 사이드바
- 관리자 페이지(탈퇴, 페널티, 게시판 삭제) - url을 다르게? 추후 결정

# 21.09.02 
세 번째 팀회의 진행(비대면) <br>
참가자 : 김환서, 문예리, 신민주, 신수진, 이희재, 한민호<br>
## 회의주제 
### 1. 팀이름 변경
   - FITI랑 WeFit 둘 중 고민
   - WeFit으로 가기로 함 
### 2. 로고 작성
   - 여러 로고들 중 아래 로고로 결정 <br>
   ![로고](https://user-images.githubusercontent.com/87509186/131949657-10b0ea2c-57b3-44e7-b502-75d8cfe59f75.png)

### 3. 전체적인 디자인 및 기능 설명 및 수정사항
   1. 메인화면
   ![01메인화면](https://user-images.githubusercontent.com/87509186/131853544-8a7501bf-9695-409e-9a56-049513337523.png)
    - 기능 설명 
      - 검색 창 만들어서 카테고리별 검색 결과가 뜨게끔...
        검색결과  5개씩 출력되게끔 하고 각 각 더보기버튼 만들기
      - 회원 탈퇴 구현
      - 메인화면에서 메인 메뉴중 하나만 눌렀을 때 서브메뉴 전체가 보이게 하고<br>
        서브메뉴로 진입하고 나서 메인메뉴에 해당하는 서브메뉴가 보이게끔
      - 메뉴 수정 
         - 함께 운동해요 (친구찾기, 장소찾기)
         - 운동팁 (운동강의, 식단/영양정보, 나만의 운동 꿀팁)
         - 게시판 (공지사항, 자유게시판(탭 : 전체, 자유글, 소식/정보, 홍보, 기타), 질문게시판)
         - 장터 (사요, 팔아요, 나눠요)
   2. 친구찾기
   ![02친구찾기통합 신민주](https://user-images.githubusercontent.com/87509186/131853649-402f7b42-b0bc-4ae2-8e38-eab2404bb068.png)
    - 기능 설명 및 수정사항
      - 검색하기전 지역별 전체목록 뜨게하고
      - 채팅창 팝업(모달창)
      - 창닫기버튼 - 팝업창 만 닫기
      - 나가기버튼 - 모임자체를 탈퇴
      - 모임장 - 구성원 구분
      - 마이페이지에 모임추가 
      - 친구를 매칭을 하고 모임을 만들고 하려면 테이블이 한명당 한테이블씩 필요하게 됨 구축을 하게 되면
    많이 복잡해지므로 외래키를 없이하거나 다른방법을 구현해야함 (너무 어려워질 것 같아서 나중에 ㅠㅠ)
     
   3. 장소찾기
   ![03장소 이희재](https://user-images.githubusercontent.com/87509186/131853662-f380002b-536c-4b66-80d5-c588f6613bad.png)
  - 기능 설명 및 수정사항
     - 지역은 처음에 로딩할때 사용자의 위치가 등록되게끔하고 선택도 자유롭게 할 수 있게끔
     - 종목 직접선택
     - 별점순, 거리순, 가나다순(될지 안될지는 모르겠음)
     - 시설사진 - 처음에는 하나만 보이게 하고 클릭을 했을때 전체화면 슬라이드쇼처럼 넘기면서 볼 수 있게끔
     - 평점 - > 한줄평등록할 때 같이 등록할 수 있게끔 처리

     
   4. 운동강의
   ![04운동강의 김환서](https://user-images.githubusercontent.com/87509186/131853993-c558530f-6188-4dfe-93ef-7ba8690fca44.png)
  - 기능 설명 및 수정사항
      - 올릴수 있는 사람 :  관리자 
      - 페이징버튼으로 수정필요
      - 댓글은 스크롤방식

   5. 식단
   ![05식단 문예리](https://user-images.githubusercontent.com/87509186/131854004-83aad55c-3d74-4759-8c71-b57dc1d4b401.png)
  - 기능 설명 및 수정사항
      - 회원이 글쓰기 권한 있고 , 비회원은 글쓰기권한x 조회 O 좋아요 버튼까지만 되게끔
            게시글중 관련없는 이상한 사진을 올린 글에 대해 신고버튼 추가!
      -  대분류 셀렉트창으로 제공 기타를 입력하면 직접입력하게끔
      - 관리자와 글쓴본인만 수정, 삭제가능하도록
      - 상세페이지의 글쓰기 버튼은 수정으로 변경하고 삭제버튼 추가

   6. 꿀팁
   ![06꿀팁 김환서](https://user-images.githubusercontent.com/87509186/131854011-07213ea5-4252-4347-ba09-cfcd177e640d.png)
  - 기능 설명 및 수정사항
      - 성공후기!도 같이 나오게하고
      - 추천수랑 좋아요도 나왔으면 함

   7. 게시판
   ![07게시판 신수진](https://user-images.githubusercontent.com/87509186/131854015-4c20e29a-4468-48f2-8c02-cf7a1d9d42d5.png)
  - 기능 설명 및 수정사항
      - 질문 게시판 태그 클릭시 해당 태그별 검색가능
      - 자유게시판, 질문게시판에 신고버튼이 있었으면 함

   8. 장터 
      1. 글쓰기
      ![08장터 한민호-글쓰기](https://user-images.githubusercontent.com/87509186/131854024-762957e3-e53b-4478-b9fd-e1513bdf4b84.png)
      2. 장터
      ![08장터 한민호-장터 - 한민호](https://user-images.githubusercontent.com/87509186/131854033-7e6a83dc-45b4-4144-9474-8cbe55eba8d9.png)
      3. 팔아요
      ![08장터 한민호-팔아요](https://user-images.githubusercontent.com/87509186/131854042-6b7664c6-eda4-491b-8005-cc64fc9c455f.png)
      4. 팔아요 예시(라켓팔기)
      ![08장터 한민호-테니스 라켓 팔아요](https://user-images.githubusercontent.com/87509186/131854035-d0bae52b-6d55-459f-bf62-99922adf4875.png)
  - 기능 설명 및 수정사항
    - 목록페이지 스크롤을 비동기방식으로 하게끔 하기
    - 팔아요 목록 페이지 - 처음 화면처럼 볼 수 있게 끔(사진,제목, 가격)
    - 검색창이랑 거리별 정렬버튼 추가??
    - 상세페이지 
      - 비회원은 게시물을 볼 수는 있으나 번호, 메일같은 개인정보가 안보이게 필터링 처리되게끔 하기
      - 수정하기, 삭제버튼은 본인과 관리자만 가능하게끔
      - 스크롤은 사진이랑 설명이랑 같이 이동하게끔
     
  - 권한
    - 관리자 - 공지사항, 강의 게시판 수정
    - 회원 - 댓글쓰기, 글쓰기(댓글10번)
    - 비회원 - 글보기, 좋아요 클릭

  - 마이페이지에 보일 것들
     - 본인이 쓴 게시글들 모두 볼 수 있게끔(5개씩만)
 
 ### 4. 화면 분배
   - 신수진 : 헤더, 푸터, 사이드바, 운동강의
   - 문예리 : 장소
   - 한민호 : 식단
   - 신민주 : 꿀팁, 게시판
   - 이희재 : 장터
   - 김환서 : 회원가입, 로그인, 비밀번호찾기 - 모달창
              비밀번호 변경페이지
              마이페이지 - 회원정보 변경에서 비밀번호 변경가능하게끔

 ### 5. 일정
    - 기획          08/31~09/02
    - HTML, CSS     09/03~09/12
    - 기능구현개발   09/08~09/25
    - 테스트        09/23~09/27
    - 발표준비      09/28~10/02
[▲맨위로](#wefit)

#21.09.03
HTML, CSS 작업하기 <br>
## 작업하면서 문제점
 - 깃사용법이 익숙하지 않아 동기화가 제대로 이루어지지 않음 
   - zoom 화면공유를 통해 알려드림

# 21.09.04
문제점 파악
- 파일 정리 필요
- 작성했던 파일들이 사라져버림 ㅠㅠ
- 같은 css/js를 각 파일마다 참조하고 있음
<br>

[▲맨위로](#wefit)

# 21.09.05
HTML, CSS 작업하기 <br>
- 김환서
  - resource파일들 (css, js, img, font)경로 변경
  - html파일들 정리
  - bootstrap 버전 업
  - 헤더 푸터 분리
- 한민호
  - diet_board.html 기본 배치완료
  - 뼈대 구성

[▲맨위로](#wefit)
# 21.09.06
  HTML,CSS 작업하기
  
## 작업하면서 생긴 문제
  - 경로를 변경하고 부트스트랩 버전을 업그레이드 했더니 
    되던 파일들이 꼬여버린 문제 발생
    - vsc를 clone한 폴더로 열기
    - 부트스트랩 버전 5에서 다시 3으로 낮춤
[▲맨위로](#wefit)
## 21.09.07
  HTML,CSS 작업하기 <br>
### 작업 내용
  - 김환서
    - user, modal
  - 문예리
    - location
  - 신민주
    - free, notice, qna, tip
  - 신수진
    -include, course
  - 이희재
    - market
  - 한민호
    - diet

### 회의 진행
  - 비번 변경 페이지 수정 필요
  - 장터 게시판이랑 장소 게시판 이미지 여러장 업로드 했을때 
    게시글 목록 페이지에서 가장 1번째 사진을 썸네일로 사용
  - 꿀팁게시판을 자유게시판에 합치기
  - 케러셀(쿠팡 사진 전환) 시설 페이지 적용시켰으면 함
  - 게시판들은 페이징을 버튼으로 구현할 예정임
  - 무조건 사진이 들어가는 게시판(장터, 식단등..)들은 바둑판 형식으로 
    사진이 들어갈 수도 있는 게시판(공지사항, 자유게시글...) 리스트 형식으로
    (단, 리스트 형식에서 사진이 들어간 게시글은 사진이 들어갔다는 표시만 할 수 있게끔)함
  - 게시판목록페이지 대략적인 레이아웃은 free_board.html로 따라갈 것

### 내일 할 것
  - 전체 레이아웃 변경
  - 
[▲맨위로](#wefit)
## 21.09.08
  HTML,CSS 작업하기 <br>
  - 레이아웃 변경 
  ![변경된 전체 레이아웃](https://user-images.githubusercontent.com/87509186/132431777-2f6c9603-7030-4ff7-9fbc-d126ddddd93f.png)
  - 사이드바를 접어서 화면을 넓게 볼 수 있었으면 좋겠음
  - 깃 관련 전달사항 전달하고 오류있는 분들 원격으로 해결
  - 게시판 형식 통일
  (강의, 식단, 자유, 장소, 장터, 공지사항, 질문)
    - 사진이 무조건 들어있는 게시판 (강의,식단,장터,장소)
    ![KakaoTalk_20210907_172106831 (2)](https://user-images.githubusercontent.com/87509186/132432664-ce87a000-335c-452d-bfe0-b127596529c2.png)
    - 사진이 안들어갈 수도 있는 게시판(자유, 공지사항, 질문)
    ![KakaoTalk_20210908_101944102_LI](https://user-images.githubusercontent.com/87509186/132432703-91832d85-b8b2-48f5-a2df-96d378160d06.jpg)
    - 글쓰기 페이지(모두 통일)
    ![KakaoTalk_20210908_102001824](https://user-images.githubusercontent.com/87509186/132432707-8a5f5326-5282-4907-80ac-28b8fef92c97.png)

  DB테이블 회의 <br>
  - 운동강의테이블
    - 글번호(pk), 제목, 카테고리, 뷰수, 썸네일파일 경로, 유튜브 경로, 작성일
  - 식단
    - 글번호(pk), 제목, 닉네임, 작성일, 조회수, 좋아요수, 이미지경로

  - 댓글테이블 - 각 게시판별로 하나씩
    - 댓글번호(pk),글번호, 댓글내용, 작성자, 작성일

  - 회원테이블
    - 회원번호(pk), 이메일(중복x), 비밀번호, 핸드폰번호, 가입일
  

[▲맨위로](#wefit)

## 21.09.09
  HTML,CSS 작업하기 <br>
   - 김환서
      - 헤더 부분 오류 ▶ 전면 수정
      - 게시판 전체 UI 수정 (장터 빼고)
      - 전체 게시판 글쓰기 게시판 수정      
   
  DB모델링 회의 <br>
   - 참가자: 한민호(장), 문예리, 이희재, 신수진, 신민주
      - 테이블 및 컬럼들
      
        - < 유저 테이블 >
          - 회원번호 (PK), 이메일(아이디), 닉네임, 비밀번호, 핸드폰번호, 가입일
        - < 장소 테이블 >
          - 글 번호(PK), 작성자(=회원번호), 장소명, 주소, 내용, 작성일, 조회 수, 좋아요 수, 신고 수, 제목, 지역1 (시/도), 지역2 (시/군/구), 종목명
        - < 식단 테이블 >
          - 글 번호(PK), 글 제목, 사진 파일, 내용, 회원번호, 닉네임, 조회 수, 좋아요 수, 신고 수, 작성일
        - < 운동강의 테이블 >
          - 글 번호(PK), 제목, 영상내용1(=유튜브 링크 주소), 영상내용2(=영상내용 설명), 강의 카테고리 (=운동 종목), 회원번호(=관리자번호), 좋아요 수, 조회 수, 작성일, 종목명
        - < 자유,공지,질문 게시판 테이블 >
          - 글 번호(PK), 회원번호, 닉네임, 작성일, 제목, 글 내용, 조회 수, 좋아요 수, 신고 수
        - < 장터 테이블 >
          - 글 번호 (PK), 작성자, 제목, 거래형태, 내용, 가격, 제품 이미지, 좋아요, 지역, 조회 수, 신고 수
        - < 댓글 테이블 >
          - 댓글 번호 (PK), 글 번호, 내용, 회원번호, 작성자, 작성일

      - 개념적 모델링
        - 문예리 - 장소
        ![문예리](https://user-images.githubusercontent.com/87509186/132717581-2b0ddd67-4293-4a4b-8a67-4004b7bd56a3.png)
        - 신민주 - 자유, 공지, 질문 
        ![신민주](https://user-images.githubusercontent.com/87509186/132717588-00151cdb-59cc-4ee8-ad69-0f63c456a7c3.jpg)
        - 신수진 - 강의 
        ![신수진](https://user-images.githubusercontent.com/87509186/132717591-52dc2f7d-f997-4b49-a6e9-c9fb679a7bba.png)
        - 이희재 - 장터 
        ![이희재](https://user-images.githubusercontent.com/87509186/132717604-88f3d455-2e84-477d-8368-c2bb8720c695.png)
        - 한민호 - ??
        ![한민호](https://user-images.githubusercontent.com/87509186/132717609-5439e08e-16a0-4368-92c0-1c965d5a0f7d.png)

      - ERD
        - 문예리 - 장소
        ![문예리](https://user-images.githubusercontent.com/87509186/132719056-c834c4e6-ef38-422e-904f-84b2e468e75f.png)
        - 신민주 - 공지, 자유, 질문
        ![신민주](https://user-images.githubusercontent.com/87509186/132719060-11534efd-e672-4e4d-bc84-d560375fc428.jpg)
        - 신수진 - 강의
        ![신수진](https://user-images.githubusercontent.com/87509186/132719062-e36be15c-7252-4de6-b287-3cdc2473fcd8.png)
        - 이희재 - 장터
        ![이희재](https://user-images.githubusercontent.com/87509186/132719065-b7d0ef8a-03b3-4fff-9604-820ce0409005.png)
        - 한민호 - 식단
        ![한민호](https://user-images.githubusercontent.com/87509186/132719068-bf86553d-5672-47b6-a07c-72eef47e9dc1.png)
  
### 내일 할 것
  - 프로토 타입 보면서 (DB랑 프론트)수정사항 회의 
  - 이메일전송 라이브러리 어떤거 사용할지
  - 장소 api 어떤거 사용할지
  - 장소 테이블 거리별 정렬하는 방법 회의
  
  - git 연습해보기
  - 상세페이지 html, css 작업
  - 메인페이지 및 비밀번호 변경페이지 디자인

[▲맨위로](#wefit)
