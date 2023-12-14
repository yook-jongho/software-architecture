import React from "react";
import styled from "styled-components";
import { cocktails } from "../constants/drink";

const ContainerStyle = styled.div`
  display: flex;
  flex-direction: row;
  flex-wrap: wrap;
  justify-content: center;
`;

const Category = styled.div`
  position: relative;
  padding: 10px;
  color: white;
  display: flex;
  flex-direction: column;
  pre {
    width: 180px;
    white-space: pre-wrap;
    font-family: "BMEULJIRO"; // pre 태그에 대한 폰트 패밀리 추가
    font-size: 20px; // pre 태그에 대한 폰트 크기 추가
  }
`;

const ImgStyle = styled.img`
  width: 200px; // 이미지를 컨테이너에 꽉 차도록 설정
  height: 200px;
  border-radius: 20px;
`;

const ImgBox = () => {
  const data = cocktails;
  return (
    <>
      <ContainerStyle>
        {data.map((item, index) => {
          return (
            <Category key={item.name}>
              {/* // TO DO 추후 서버에서 내려주는 imgUrl로 변경해야함 */}
              <ImgStyle src={`${process.env.PUBLIC_URL}/mohito.png`}></ImgStyle>
              <pre>
                {`
이름 - ${item.name}
도수 - ${item.alcoholContent}
설명 - ${item.description}
레시피 - ${item.recipe}
`}
              </pre>
            </Category>
          );
        })}
      </ContainerStyle>
    </>
  );
};

export default ImgBox;
