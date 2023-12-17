package softwareArchitecture.project.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.springframework.stereotype.Service;
import softwareArchitecture.project.repository.HighballRepository;

@Service
public class HighballService {

    private List<HighballRepository> highballs = new ArrayList<>();

    public HighballService() {
        highballs.add(new HighballRepository("클래식 위스키 하이볼", "약 10%", "위스키와 소다의 클래식한 조합. 깔끔하고 상쾌한 맛.", "위스키 45ml와 소다수를 잔에 넣고 얼음으로 채움","https://velog.velcdn.com/images/wkawha_rowk/post/85d4c66c-baac-4d4c-a66e-7e383df781fc/image.png"));
        highballs.add(new HighballRepository("진저 하이볼", "약 8%", "진저 에일로 만든 향긋하고 매콤한 하이볼.", "위스키 45ml에 진저 에일을 추가하고 얼음으로 채움","https://velog.velcdn.com/images/wkawha_rowk/post/17fa0f09-d17c-4d02-b5b4-4fd0281cc532/image.png"));
        highballs.add(new HighballRepository("레몬 하이볼", "약 8%", "상큼한 레몬의 맛이 돋보이는 하이볼.", "위스키 45ml, 레몬 주스와 소다수를 섞고 얼음 추가","https://velog.velcdn.com/images/wkawha_rowk/post/0132009e-b4e3-4467-a52f-57ce1ec8b7cf/image.png"));
        highballs.add(new HighballRepository("애플 하이볼", "약 8%", "사과 주스로 달콤함을 더한 하이볼.", "위스키 45ml, 사과 주스를 넣고 소다수로 마무리","https://velog.velcdn.com/images/wkawha_rowk/post/66b090cd-4e4d-4b76-9408-9f86d1a4904c/image.png"));
        highballs.add(new HighballRepository("피치 하이볼", "약 8%", "복숭아 향이 가득한 달콤한 하이볼.", "위스키 45ml, 피치 리큐어와 소다수를 추가","https://velog.velcdn.com/images/wkawha_rowk/post/0c5ad253-a87b-411a-9e2d-48555bb73810/image.png"));
        highballs.add(new HighballRepository("블랙베리 하이볼", "약 8%", "블랙베리의 풍부한 맛과 향이 나는 하이볼.", "위스키 45ml, 블랙베리 시럽과 소다수를 섞음","https://velog.velcdn.com/images/wkawha_rowk/post/244a411d-df9a-45c6-ba8d-b6d8f15d628c/image.png"));
        highballs.add(new HighballRepository("오렌지 하이볼", "약 8%", "오렌지의 신선함이 느껴지는 하이볼.", "위스키 45ml, 오렌지 주스와 소다수를 혼합","https://velog.velcdn.com/images/wkawha_rowk/post/c53560a5-c250-42e8-947e-d923b78eba29/image.png"));
        highballs.add(new HighballRepository("바닐라 하이볼", "약 8%", "바닐라의 달콤한 향이 나는 하이볼.", "위스키 45ml, 바닐라 시럽과 소다수를 추가","https://velog.velcdn.com/images/wkawha_rowk/post/535837a9-30d0-4f37-b8d3-d781fb1baf40/image.png"));
        highballs.add(new HighballRepository("커피 하이볼", "약 8%", "커피의 진한 맛이 느껴지는 하이볼.", "위스키 45ml, 콜드브루 커피와 소다수를 넣음","https://velog.velcdn.com/images/wkawha_rowk/post/c2187fa9-4e21-4f16-ad3b-6b3c9406e65b/image.png"));
        highballs.add(new HighballRepository("민트 하이볼", "약 8%", "상쾌한 민트의 향이 가득한 하이볼.", "위스키 45ml, 민트 리큐어와 소다수를 혼합","https://velog.velcdn.com/images/wkawha_rowk/post/118548cb-6fb5-4465-9cbd-dd96a9620ea3/image.png"));
        highballs.add(new HighballRepository("체리 하이볼", "약 8%", "체리의 달콤하고 풍부한 맛이 나는 하이볼.", "위스키 45ml, 체리 주스와 소다수를 섞음","https://velog.velcdn.com/images/wkawha_rowk/post/051c0bee-bb06-4959-8492-366b771414c3/image.png"));
        highballs.add(new HighballRepository("라임 하이볼", "약 8%", "라임의 신선하고 산뜻한 맛이 나는 하이볼.", "위스키 45ml, 라임 주스와 소다수를 추가","https://velog.velcdn.com/images/wkawha_rowk/post/c6e69248-a527-46f8-9cc8-1d8bde82937f/image.png"));
        highballs.add(new HighballRepository("카라멜 하이볼", "약 8%", "카라멜의 달콤함이 느껴지는 하이볼.", "위스키 45ml, 카라멜 시럽과 소다수를 넣음","https://velog.velcdn.com/images/wkawha_rowk/post/964ff0ef-4c84-4d56-a941-c4f8b1b65c9c/image.png"));
        highballs.add(new HighballRepository("블루베리 하이볼", "약 8%", "블루베리의 달콤한 맛이 나는 하이볼.", "위스키 45ml, 블루베리 주스와 소다수를 혼합","https://velog.velcdn.com/images/wkawha_rowk/post/d2d2a3e0-63f9-405e-80d3-291fd9faa727/image.png"));
        highballs.add(new HighballRepository("자몽 하이볼", "약 8%", "자몽의 새콤달콤한 맛이 돋보이는 하이볼.", "위스키 45ml, 자몽 주스와 소다수를 추가","https://velog.velcdn.com/images/wkawha_rowk/post/8f10d08b-9f28-41f4-a5bf-3b9d609abb9f/image.png"));
        highballs.add(new HighballRepository("초콜릿 하이볼", "약 8%", "초콜릿의 달콤하고 진한 맛이 나는 하이볼.", "위스키 45ml, 초콜릿 시럽과 소다수를 섞음","https://velog.velcdn.com/images/wkawha_rowk/post/634456af-ca80-4bbe-a063-9ecac8c2434a/image.png"));
        highballs.add(new HighballRepository("허니 하이볼", "약 8%", "꿀의 달콤함이 느껴지는 하이볼.", "위스키 45ml, 꿀 시럽과 소다수를 혼합","https://velog.velcdn.com/images/wkawha_rowk/post/99b982c7-becd-441f-b597-68e07abbd3f9/image.png"));
        highballs.add(new HighballRepository("시나몬 하이볼", "약 8%", "시나몬의 향긋한 맛이 나는 하이볼.", "위스키 45ml, 시나몬 시럽과 소다수를 추가","https://velog.velcdn.com/images/wkawha_rowk/post/917ddfe6-5993-4874-af8e-eb7c9e22c816/image.png"));
        highballs.add(new HighballRepository("베리믹스 하이볼", "약 8%", "다양한 베리의 맛이 조화를 이루는 하이볼.", "위스키 45ml, 혼합 베리 주스와 소다수를 넣음","https://velog.velcdn.com/images/wkawha_rowk/post/39784f82-366b-4d83-b7b6-f39e0c2fb551/image.png"));
        highballs.add(new HighballRepository("엘더플라워 하이볼", "약 8%", "엘더플라워의 향긋한 맛이 나는 하이볼.", "위스키 45ml, 엘더플라워 시럽과 소다수를 혼합","https://velog.velcdn.com/images/wkawha_rowk/post/1fb86aee-f8de-4496-af06-a51481dde851/image.png"));
    }

    public List<HighballRepository> getAllHighballs() {
        return highballs;
    }

    public List<HighballRepository> getAllHighballsSortedByABV() {
        highballs.sort(Comparator.comparing(HighballRepository::getABVAsDouble));
        return new ArrayList<>(highballs);
    }

    public List<HighballRepository> getAllHighballsSortedByName() {
        highballs.sort(Comparator.comparing(HighballRepository::getName));
        return new ArrayList<>(highballs);
    }
}
