import React, { useEffect, useState } from "react";
import styled from "styled-components";
import useHttpGet from "../customHook/customHook";
import { cocktail, beer, wine, highball } from "../constants/drink";
import Modal from "./modal";

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
    text-align: center;
    span {
        font-family: "BMEULJIRO"; // pre 태그에 대한 폰트 패밀리 추가
        font-size: 20px; // pre 태그에 대한 폰트 크기 추가
    }
`;

const Pstyle = styled.p`
    color: white;
`;

const ImgStyle = styled.img`
    width: 200px; // 이미지를 컨테이너에 꽉 차도록 설정
    height: 200px;
    border-radius: 20px;
`;

const ImgBox = ({ category }) => {
    // const apiUrl = `http://172.30.1.85:8080/${category}`;
    // const { data, loading, error } = useHttpGet(apiUrl);
    const categoryData = {
        cocktail: cocktail,
        highball: highball,
        wine: wine,
        beer: beer,
    };

    const selectedCategoryData = categoryData[category] || [];

    const [isModal, setIsModal] = useState(false);
    const [details, setDetails] = useState();
    const handleModal = (data) => {
        setIsModal(!isModal);
        setDetails(data);
        console.log(data.Url);
    };

    // if (loading) {
    //     return <Pstyle>Loading...</Pstyle>;
    // }

    // if (error) {
    //     return <Pstyle>Error occurred: {error.message}</Pstyle>;
    // }
    return (
        <>
            <ContainerStyle>
                {selectedCategoryData.map((item, index) => {
                    return (
                        <Category
                            key={item.name}
                            onClick={() => {
                                handleModal(item);
                            }}
                        >
                            {/* // TO DO 추후 서버에서 내려주는 imgUrl로 변경해야함 */}
                            <ImgStyle src={`${item.Url}`}></ImgStyle>
                            <span>{item.name}</span>
                        </Category>
                    );
                })}
            </ContainerStyle>
            {isModal && <Modal details={details} onClose={handleModal}></Modal>}
        </>
    );
};

export default ImgBox;
