import React from "react";
import styled from "styled-components";

const ContainerStyle = styled.div`
  display: flex;
  flex-direction: row;
  justify-content: center;
`;

const Category = styled.div`
  position: relative;
  padding: 10px;
  display: flex;
  flex-direction: column;
  text-align: center;
  color: white;
  :hover {
    opacity: 1;
    z-index: 999;
  }
`;

const ImageStyle = styled.img`
  width: 300px; // 이미지를 컨테이너에 꽉 차도록 설정
  height: 300px;
  border-radius: 20px;
  opacity: 0.5;
  transition: all 0.5s;
`;

const CategoryTitle = styled.b`
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  z-index: 1; /* 텍스트를 이미지 위로 올리기 */
  font-size: 25px;
  font-family: "BMEULJIRO";
`;

const MainContainer = () => {
  const categoryData = [
    { imgUrl: "cocktail.jpg", category: "칵테일" },
    { imgUrl: "highball.jpg", category: "하이볼" },
    { imgUrl: "wine.jpg", category: "와인" },
    { imgUrl: "beer.webp", category: "맥주" },
  ];

  return (
    <>
      <ContainerStyle>
        {categoryData.map((data, index) => {
          return (
            <Category key={data.imgUrl}>
              <ImageStyle
                src={`${process.env.PUBLIC_URL}/${data.imgUrl}`}
              ></ImageStyle>
              <CategoryTitle>{data.category}</CategoryTitle>
            </Category>
          );
        })}
        ;
      </ContainerStyle>
    </>
  );
};

export default MainContainer;
