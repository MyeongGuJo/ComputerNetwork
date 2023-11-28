# ComputerNetwork

한양대학교 컴퓨터소프트웨어학부 2023년 2학기 컴퓨터 네트워크 강의 과제

주어진 *html* 파일을 serving 하는 server를 java로 구현.

## first_web (HTTP protocol on application layer)
- For network traffic, you are to use the “com.sun.net” packages 
- For cookie handling, you are to use the “java.net.HttpCookie” packages

*html*파일을 *jsoup* 라이브러리로 다 파싱하고 이 라이브러리는 외부 라이브러리라서 사용하면 안되는 것을 꺠달음..

쓰는 게 더 좋은 과제가 아니었을까?

결국 원시적으로 *html*을 복붙해서 넣음.


## 프로젝트 구조
![image](https://github.com/MyeongGuJo/ComputerNetwork/assets/102133534/8ec9934f-29ce-45da-a775-33a6ea4ba4f0)


## Reference

혼자 하기에 너무 막막해서 해당 블로그의 코드를 (많이) 참고함.

`https://velog.io/@yeomyaloo/%EC%9E%90%EB%B0%94%EB%A5%BC-%EC%82%AC%EC%9A%A9%ED%95%B4-%EC%9B%B9%EC%84%9C%EB%B2%84%EB%A5%BC-%EA%B5%AC%EC%B6%95%ED%95%B4%EB%B3%B4%EC%9E%90`

## TCP_server

Assignment #1 에서 Http 프로토콜을 사용하여 서버를 구현하였다면,

이번엔 Trasport Layer의 TCP 레벨에서 서버를 구현함

- Http, HttpCookie package 사용 금지

첫 과제할 때는 새로워서 많이 헷갈렸는데

이번에는 소켓 사용법만 익히고 혼자 다 구현함

적응한 듯?

## Reference 2

`https://woolbro.tistory.com/m/29`
