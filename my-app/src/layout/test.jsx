import Header from "./header";
import Header2 from "./headerV2";
import MainContainer from "./mainContainer";
import styled from "styled-components";

const Wrapper = styled.div`
  width: 1080px;
  margin: 0 auto;
`;
const MainTest = () => {
  return (
    <Wrapper>
      {/* <Header></Header> */}
      <Header2></Header2>
      <MainContainer></MainContainer>
    </Wrapper>
  );
};
export default MainTest;
