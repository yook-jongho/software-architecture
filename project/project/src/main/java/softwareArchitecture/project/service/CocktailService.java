package softwareArchitecture.project.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.springframework.stereotype.Service;
import softwareArchitecture.project.repository.CocktailRepository;

@Service
public class CocktailService {

    private List<CocktailRepository> cocktails = new ArrayList<>();

    public CocktailService() {
        cocktails.add(new CocktailRepository("모히토", "약 8-10%", "민트와 라임의 상쾌한 향과 함께 화이트 럼의 부드러운 맛이 어우러진 클래식한 쿨러.", "화이트 럼 60ml, 민트 8장, 설탕 2큐브, 라임 주스 30ml, 탄산수","https://velog.velcdn.com/images/wkawha_rowk/post/0a47e301-ac20-4fae-8113-d9ca8ed5fc80/image.png"));
        cocktails.add(new CocktailRepository("마르가리타", "약 15-20%", "테킬라의 향과 신선한 라임 주스가 조화로운 멕시코의 대표적인 칵테일.", "테킬라 60ml, 산토스 30ml, 라임 주스 30ml, 얼음","https://velog.velcdn.com/images/wkawha_rowk/post/695ae0eb-d14e-41eb-b289-352b19ec4d14/image.png"));
        cocktails.add(new CocktailRepository("핑크 진 토닉", "약 10-15%", "진과 핑크 토닉 워터가 어우러져 담백하면서도 상큼한 맛을 선사하는 칵테일.", "진 60ml, 핑크 토닉 워터, 라임","https://velog.velcdn.com/images/wkawha_rowk/post/5a599c66-4a5a-43b3-9ca3-cca9fc035fb7/image.png"));
        cocktails.add(new CocktailRepository("에스프레소 마티니", "약 15-20%", "커피의 깊은 풍미와 달콤한 커피 리큐어가 조화로운 커피 향의 칵테일.", "보드카 45ml, 커피 리큐어 20ml, 설탕 시럽 10ml, 에스프레소 30ml","https://velog.velcdn.com/images/wkawha_rowk/post/4ef9888d-619c-4080-9287-7728c8288455/image.png"));
        cocktails.add(new CocktailRepository("몬스터 카우", "약 15-20%", "블루 큐라소와 코코넛 크림이 더해져 화려하면서도 상쾌한 맛의 칵테일.", "화이트 럼 45ml, 블루 큐라소 15ml, 코코넛 크림 30ml, 파인애플 주스 30ml","https://velog.velcdn.com/images/wkawha_rowk/post/b07ac5f7-ad82-4eb0-8148-f860983341bc/image.png"));
        cocktails.add(new CocktailRepository("오렌지 블러썸", "약 12-15%", "오렌지 주스와 진이 만나 화사하면서도 상쾌한 향이 특징인 칵테일.", "진 45ml, 오렌지 주스 30ml, 달콤한 베르무트 15ml","https://velog.velcdn.com/images/wkawha_rowk/post/6aa1a69a-fa41-424a-ade6-b46cf3d658f1/image.png"));
        cocktails.add(new CocktailRepository("레몬 드랍", "약 15-20%", "레몬 주스와 달콤한 트리플 섹이 어우러져 상쾌하면서도 달콤한 맛의 칵테일.", "보드카 45ml, 트리플 섹 15ml, 레몬 주스 30ml, 설탕 시럽 10ml","https://velog.velcdn.com/images/wkawha_rowk/post/1f46209e-fc22-4f70-ad05-66fe16cc83b9/image.png"));
        cocktails.add(new CocktailRepository("피나 콜라다", "약 10-15%", "라이트 럼, 코코넛 크림, 파인애플 주스가 조화로운 엑조틱한 피나 콜라다.", "라이트 럼 45ml, 코코넛 크림 30ml, 파인애플 주스 45ml, 얼음","https://velog.velcdn.com/images/wkawha_rowk/post/f61a886b-26b8-4789-a4d0-5c6b7c070c33/image.png"));
        cocktails.add(new CocktailRepository("블랙 러시안", "약 20-25%", "보드카와 커피 리큐어만으로 만들어지는 간단하면서도 향긋한 블랙 러시안.", "보드카 50ml, 커피 리큐어 25ml","https://velog.velcdn.com/images/wkawha_rowk/post/68f4ec54-c96d-441e-9ed4-4dd593191883/image.png"));
        cocktails.add(new CocktailRepository("프렌치 75", "약 15-20%", "진, 레몬 주스, 샴페인이 조화로워 고급스러운 맛을 선사하는 프렌치 75.", "진 45ml, 레몬 주스 30ml, 설탕 시럽 10ml, 샴페인","https://velog.velcdn.com/images/wkawha_rowk/post/ba90f7f5-f1ed-4732-9106-03c01b2c3e6e/image.png"));
        cocktails.add(new CocktailRepository("마이 타이", "약 20-25%", "화이트 럼과 다크 럼의 조화로운 맛과 오렌지 리큐어, 라임 주스가 어우러진 엑조틱한 칵테일.", "화이트 럼 30ml, 다크 럼 30ml, 오렌지 리큐어 15ml, 라임 주스 15ml, 오렌지 시럽 10ml","https://velog.velcdn.com/images/wkawha_rowk/post/36b0071f-8d78-4477-8afa-c64535743f64/image.png"));
        cocktails.add(new CocktailRepository("카이프로스 마르타니", "약 15-20%", "진, 그레나딘, 라임 주스, 석류 주스가 조화로워 화려하면서도 상쾌한 맛의 마르타니.", "진 45ml, 그레나딘 15ml, 라임 주스 20ml, 석류 주스 15ml","https://velog.velcdn.com/images/wkawha_rowk/post/616aa439-e0f8-4c3c-b382-58b2c3adc6a5/image.png"));
        cocktails.add(new CocktailRepository("블루 라군", "약 15-20%", "블루 큐라소와 레몬 주스, 트리플 섹이 어우러져 시원하면서도 달콤한 맛의 블루 라군.", "보드카 45ml, 블루 큐라소 15ml, 레몬 주스 30ml, 트리플 섹 15ml","https://velog.velcdn.com/images/wkawha_rowk/post/0131bc68-2ec7-4d22-b827-45bf84ef9551/image.png"));
        cocktails.add(new CocktailRepository("그린 아이리시", "약 15-20%", "아이리시 위스키와 크림 드 멘스와의 환상적인 조합이 돋보이는 그린 아이리시.", "아이리시 위스키 45ml, 크림 드 멘스 30ml, 그린 크림 드 멘스 15ml","https://velog.velcdn.com/images/wkawha_rowk/post/6624e23c-f3e9-4d82-bcf0-ae7daa6694bb/image.png"));
        cocktails.add(new CocktailRepository("스크류 드라이버", "약 10-15%", "보드카와 오렌지 주스가 심플하면서도 상큼한 맛의 스크류 드라이버.", "보드카 45ml, 오렌지 주스 90ml, 얼음","https://velog.velcdn.com/images/wkawha_rowk/post/f67908d8-e2a5-49cb-9c49-e5de491d50a5/image.png"));
        cocktails.add(new CocktailRepository("블루 모스코우 뮬", "약 10-15%", "블루 큐라소와 진저 비어의 상큼하고도 시원한 맛이 특징인 블루 모스코우 뮬.", "보드카 50ml, 블루 큐라소 20ml, 진저 비어, 라임","https://velog.velcdn.com/images/wkawha_rowk/post/5d3bfe56-81b4-4b26-86b0-fae18e8475a4/image.png"));
        cocktails.add(new CocktailRepository("스트로베리 더카리", "약 10-15%", "딸기와 럼의 달콤한 맛이 어우러진 썸머 시즌에 어울리는 스트로베리 더카리.", "화이트 럼 50ml, 딸기 4개, 설탕 1큐브, 라임 주스 30ml","https://velog.velcdn.com/images/wkawha_rowk/post/99819e7f-2e56-442c-b333-7ba3b7480ca7/image.png"));
        cocktails.add(new CocktailRepository("베이리스 커피 칵테일", "약 15-20%", "아이리시 크림 리큐어와 커피 리큐어의 부드러운 맛이 특징인 베이리스 커피 칵테일.", "아이리시 크림 리큐어 50ml, 커피 리큐어 25ml, 우유 50ml, 설탕 1큐브","https://velog.velcdn.com/images/wkawha_rowk/post/4be0eb2c-63e2-48ed-a713-dc282d1f0633/image.png"));
        cocktails.add(new CocktailRepository("살라미 바디 샷", "약 20-25%", "살라미와 차돌박이의 풍부한 맛이 어우러진 특별한 바디 샷.", "살라미 1조각, 차돌박이 1조각, 보드카 또는 테킬라 50ml","https://velog.velcdn.com/images/wkawha_rowk/post/8e307f75-0967-4c5d-9209-c64630dad8e2/image.png"));
        cocktails.add(new CocktailRepository("베르무트 네그로니", "약 20-25%", "진과 레드 베르무트, 비터의 균형이 잘 맞아 풍부한 맛을 선사하는 네그로니.", "진 30ml, 레드 베르무트 30ml, 캠파리 30ml, 오렌지 피트","https://velog.velcdn.com/images/wkawha_rowk/post/6814796b-06fb-4cfe-8ae5-cd2f335b6069/image.png"));
    }

    public List<CocktailRepository> getAllCocktails() {
        return cocktails;
    }

    public List<CocktailRepository> getAllCocktailsSortedByABV() {
        cocktails.sort(Comparator.comparing(CocktailRepository::getABVAsDouble));
        return new ArrayList<>(cocktails);
    }

    public List<CocktailRepository> getAllCocktailsSortedByName() {
        cocktails.sort(Comparator.comparing(CocktailRepository::getName));
        return new ArrayList<>(cocktails);
    }
}