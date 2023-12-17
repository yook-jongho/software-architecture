import React from "react";
import styled from "styled-components";

const Overlay = styled.div`
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background: rgba(0, 0, 0, 0.7);
    display: flex;
    justify-content: center;
    align-items: center;
    z-index: 1000;
`;

const ModalContainer = styled.div`
    background: #0c1a25;
    color: white;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
    max-width: 80%;
    max-height: 80%;
    overflow: auto;
    text-align: center;
    p {
        font-family: "BMEULJIRO"; // pre 태그에 대한 폰트 패밀리 추가
        font-size: 20px;
    }
`;

const ImgStyle = styled.img`
    width: 300px; // 이미지를 컨테이너에 꽉 차도록 설정
    height: 300px;
    border-radius: 20px;
`;

const Modal = ({ details, onClose }) => {
    return (
        <Overlay onClick={onClose}>
            <ModalContainer>
                <ImgStyle src={details.Url} alt="Modal" />
                <h2>{details.name}</h2>
                <p>{details.description}</p>
                <p>도수 {details.ABV}</p>
                {details.recipe !== undefined ? (
                    <p>레시피: {details.recipe}</p>
                ) : (
                    <></>
                )}
                <button onClick={onClose}>Close</button>
            </ModalContainer>
        </Overlay>
    );
};

export default Modal;
