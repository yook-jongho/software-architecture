package softwareArchitecture.project.service;

import java.util.Comparator;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import softwareArchitecture.project.repository.BeerRepository;

@Service
public class BeerService {

    private List<BeerRepository> beers = new ArrayList<>();

    public BeerService() {
        beers.add(new BeerRepository("Budweiser", "5%", "깔끔하고 부드러운 맛의 라거 스타일 맥주.","https://velog.velcdn.com/images/wkawha_rowk/post/85730d5e-3cd0-4466-811a-a9c9c922cbd9/image.png"));
        beers.add(new BeerRepository("Heineken", "5%", "약간의 홉 향과 함께 쓴맛이 나는 프리미엄 라거.","https://velog.velcdn.com/images/wkawha_rowk/post/a85eed09-355d-4a23-bee0-95d9712d7978/image.png"));
        beers.add(new BeerRepository("Corona", "4.6%", "라임을 넣어 마시는 것이 일반적인 가벼운 라거 스타일 맥주.","https://velog.velcdn.com/images/wkawha_rowk/post/ab5fd001-a704-4858-8f2d-59c64c21850a/image.png"));
        beers.add(new BeerRepository("Guinness", "4.2%", "짙은 색과 진한 맛이 특징인 스타우트 맥주.","https://velog.velcdn.com/images/wkawha_rowk/post/665fc3a0-9e4f-4074-8eaa-da8819c6132e/image.png"));
        beers.add(new BeerRepository("Stella Artois", "5%", "맑고 깔끔한 맛의 라거 스타일 맥주.","https://velog.velcdn.com/images/wkawha_rowk/post/6cac5833-2d9e-441c-8853-a4f6ca681787/image.png"));
        beers.add(new BeerRepository("Hoegaarden", "4.9%", "과일과 향신료의 풍미가 느껴지는 밀맥주.","https://velog.velcdn.com/images/wkawha_rowk/post/2235f447-b702-473c-b7a8-616532606c3f/image.png"));
        beers.add(new BeerRepository("Asahi", "5%", "드라이하고 깔끔한 맛의 슈퍼 드라이 맥주.","https://velog.velcdn.com/images/wkawha_rowk/post/7b3d3d5d-9564-4088-a919-30d8a4b75b4e/image.png"));
        beers.add(new BeerRepository("Sapporo", "4.7%", "부드럽고 맛있는 라거 스타일의 맥주.","https://velog.velcdn.com/images/wkawha_rowk/post/44f50ecb-b17a-4195-b58b-6f52065a79b3/image.png"));
        beers.add(new BeerRepository("Carlsberg", "5%", "밝은 황금색의 라거 맥주로, 약간의 달콤함과 홉의 쓴맛이 조화를 이룸.","https://velog.velcdn.com/images/wkawha_rowk/post/7988bf35-8a78-4b00-8a9b-5a75046ded91/image.png"));
        beers.add(new BeerRepository("Bud Light", "4.2%", "가볍고 산뜻한 맛의 라이트 맥주.","https://velog.velcdn.com/images/wkawha_rowk/post/8af3240a-e2e7-4283-9f0e-bac40a42bd89/image.png"));
        beers.add(new BeerRepository("Miller Lite", "4.2%", "칼로리가 낮고 가볍게 마실 수 있는 라이트 라거 스타일 맥주.","https://velog.velcdn.com/images/wkawha_rowk/post/df10d913-bc6e-4cbe-bc4c-058d50f0cb8b/image.png"));
        beers.add(new BeerRepository("Coors Light", "4.2%", "매우 가볍고 상쾌한 라거 스타일의 맥주.","https://velog.velcdn.com/images/wkawha_rowk/post/2eb0cab5-45d4-4aa3-a956-088751e79af8/image.png"));
        beers.add(new BeerRepository("Foster's", "4.9%", "풍부한 맛과 적당한 쓴맛이 특징인 호주식 라거.","https://velog.velcdn.com/images/wkawha_rowk/post/f44e1864-e20a-4b24-9dcc-40518f212fbb/image.png"));
        beers.add(new BeerRepository("Beck's", "4.9%", "맑고 쓴맛이 강조된 맛이 특징인 독일식 라거.","https://velog.velcdn.com/images/wkawha_rowk/post/7730dc91-b2de-4beb-942c-540a12d5ee9a/image.png"));
        beers.add(new BeerRepository("Tsingtao", "4.8%", "가볍고 깔끔한 맛의 중국식 라거 맥주.","https://velog.velcdn.com/images/wkawha_rowk/post/bb7f18ff-95fd-4f86-af1d-53e0734efabb/image.png"));
        beers.add(new BeerRepository("Kingfisher", "4.8%", "부드럽고 산뜻한 맛이 특징인 인도에서 가장 인기 있는 맥주.","https://velog.velcdn.com/images/wkawha_rowk/post/803da151-cbbd-496c-b738-37e615cae2ac/image.png"));
        beers.add(new BeerRepository("Pilsner Urquell", "4.4%", "깊고 풍부한 맛과 적절한 쓴맛이 조화를 이루는 세계 최초의 필스너 스타일 맥주.","https://velog.velcdn.com/images/wkawha_rowk/post/f18fb8a9-07c2-4bd9-aa45-ed888c1f7fd0/image.png"));
        beers.add(new BeerRepository("Samuel Adams", "Varies", "다양한 스타일과 풍미가 특징인 미국 크래프트 맥주.","https://velog.velcdn.com/images/wkawha_rowk/post/26e2196b-e353-480b-b7ba-8ec22c256fa4/image.png"));
        beers.add(new BeerRepository("Leffe", "6.6%", "향신료와 과일의 맛이 느껴지는 벨기에식 에일.","https://velog.velcdn.com/images/wkawha_rowk/post/4545d474-2b60-4e89-978b-7951c24f8f05/image.png"));
        beers.add(new BeerRepository("Chimay", "Varies", "풍부하고 복잡한 맛이 일품인 트라피스트 맥주.","https://velog.velcdn.com/images/wkawha_rowk/post/7f45e44e-0f62-471b-924e-5ff383be6ca0/image.png"));
    }

    public List<BeerRepository> getAllBeers() {
        return beers;
    }

    public List<BeerRepository> getAllBeersSortedByABV() {
        beers.sort(Comparator.comparing(BeerRepository::getABVAsDouble));
        return new ArrayList<>(beers);
    }

    public List<BeerRepository> getAllBeersSortedByName() {
        beers.sort(Comparator.comparing(BeerRepository::getName));
        return new ArrayList<>(beers);
    }
}