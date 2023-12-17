import React from "react";
import styled from "styled-components";
import IntroHeader from "../component/introHeader";
import { useState } from "react";
import ImgBox from "../component/imgBox";

const ContainerStyle = styled.div`
    display: flex;
    /* flex-direction: row; */
    flex-wrap: wrap;
    justify-content: center;
`;

const Category = styled.div`
    position: relative;
    padding: 10px;
    color: white;
    display: flex;
    :hover {
        opacity: 1;
        z-index: 999;
    }
`;

const ImageStyle = styled.img`
    width: 250px; // 이미지를 컨테이너에 꽉 차도록 설정
    height: 250px;
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
        { imgUrl: "cocktail.png", category: "COCKTAIL" },
        { imgUrl: "highball.png", category: "HIGHBALL" },
        { imgUrl: "wine.png", category: "WINE" },
        { imgUrl: "beer.png", category: "BEER" },
    ];

    const [imgUrl, setImgUrl] = useState("");
    const [category, setCategory] = useState("");
    const handleClick = (imgUrl, category) => {
        setImgUrl(imgUrl);
        setCategory(category.toLowerCase());
    };

    return (
        <>
            <ContainerStyle>
                {categoryData.map((data) => {
                    return (
                        <Category
                            key={data.imgUrl}
                            onClick={() => {
                                handleClick(data.imgUrl, data.category);
                            }}
                        >
                            <ImageStyle
                                src={`${process.env.PUBLIC_URL}/${data.imgUrl}`}
                            ></ImageStyle>
                            <CategoryTitle>{data.category}</CategoryTitle>
                        </Category>
                    );
                })}
            </ContainerStyle>
            {imgUrl !== "" ? (
                <>
                    <IntroHeader
                        imgUrl={imgUrl}
                        category={category}
                    ></IntroHeader>
                    <ImgBox category={category}></ImgBox>
                </>
            ) : (
                <></>
            )}
            ;
        </>
    );
};

export default MainContainer;
