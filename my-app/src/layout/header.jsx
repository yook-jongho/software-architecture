import React from "react";
import styled from "styled-components";

const Main = styled.header`
    width: 1080px;
    height: 80px;
    border-bottom: 2px solid #0c1a25;
`;

const Container = styled.div`
    display: flex;
    width: 96%;
    max-width: 1080px;
    height: 100%;
    margin: 0 auto;
    align-items: center;
    justify-content: space-between;
`;

const LogoBox = styled.div`
    display: flex;
    text-align: center;
    align-items: center;
    h2 {
        padding-left: 10px;
    }
`;

const Navigation = styled.ul`
    display: flex;
    list-style: none;

    li + li {
        margin-left: 30px;
    }
`;

const ImgBox = styled.img`
    width: 50px;
    height: 50px;
`;

const Header = () => {
    return (
        <Main>
            <Container>
                <LogoBox>
                    <ImgBox
                        src={`${process.env.PUBLIC_URL}/logomain.png`}
                    ></ImgBox>
                    <h2>맛있주(酒)</h2>
                </LogoBox>

                <Navigation>
                    <li>칵테일</li>
                    <li>하이볼</li>
                    <li>맥주</li>
                    <li>와인</li>
                </Navigation>
            </Container>
        </Main>
    );
};

export default Header;
