import React from "react";
import styled from "styled-components";

const Main = styled.header`
  padding-bottom: 10px;
  color: white;
`;

const LogoBox = styled.div`
  text-align: center;
  h1 {
    font-family: "BMEULJIRO";
    font-size: 40px;
  }
  p {
    font-size: 20px;
  }
`;

// const Navigation = styled.ul`
//     justify-content: space-between;
//     display: flex;
//     list-style: none;
//     padding-top: 15px;
//     padding-left: 0px;
// `;

const ImgBox = styled.img`
  width: 150px;
  height: 150px;
  border-radius: 75%;
`;

const Header2 = () => {
  return (
    <Main>
      <nav>
        <LogoBox>
          <ImgBox src={`${process.env.PUBLIC_URL}/logomain.png`}></ImgBox>
          <h1>이번 주(酒) 다음 주(酒)</h1>
          <p>어떤 술을 드시고 싶으신가요?</p>
        </LogoBox>

        {/* <Navigation>
                    <li>칵테일</li>
                    <li>하이볼</li>
                    <li>맥주</li>
                    <li>와인</li>
                </Navigation> */}
      </nav>
    </Main>
  );
};

export default Header2;
