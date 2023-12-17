import React from "react";
import styled from "styled-components";
import { introduce } from "../constants/constatns";

const Container = styled.div`
  margin: 50px 0px 50px 0px;
  display: flex;
  flex-direction: row;
  color: white;
`;
const ImageStyle = styled.img`
  width: 400px; // 이미지를 컨테이너에 꽉 차도록 설정
  height: 400px;
  border-radius: 20px;
`;
const Descript = styled.div`
  padding-left: 20px;
  font-size: 20px;
  font-family: "BMEULJIRO";
  pre {
    font-family: "BMEULJIRO"; // pre 태그에 대한 폰트 패밀리 추가
    font-size: 25px; // pre 태그에 대한 폰트 크기 추가
  }
`;

const IntroHeader = ({ imgUrl, category }) => {
  return (
    <>
      <Container>
        <ImageStyle src={`${process.env.PUBLIC_URL}/${imgUrl}`}></ImageStyle>
        <Descript>
          <h1>{category.toUpperCase()}</h1>
          <pre>{introduce[category]}</pre>
        </Descript>
      </Container>
    </>
  );
};

export default IntroHeader;
