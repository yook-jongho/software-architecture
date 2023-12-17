package softwareArchitecture.project.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.springframework.stereotype.Service;
import softwareArchitecture.project.repository.WineRepository;

@Service
public class WineService {

    private List<WineRepository> wines = new ArrayList<>();

    public WineService() {
        wines.add(new WineRepository("Cabernet Sauvignon", "13-15%", "강한 타닌과 블랙베리, 세다, 토바코의 향이 특징인 레드 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/bf183802-c3c0-4da6-82b9-7682ce027772/image.png"));
        wines.add(new WineRepository("Merlot", "13-14.5%", "부드러운 타닌과 체리, 자두의 풍미가 있는 레드 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/c0543b26-0895-4e57-a964-2145654316ca/image.png"));
        wines.add(new WineRepository("Pinot Noir", "11-14%", "가벼운 타닌과 라즈베리, 체리의 맛이 나는 레드 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/1af8a8b6-ce6e-4e3f-8ca8-43ebc9aced52/image.png"));
        wines.add(new WineRepository("Chardonnay", "13-14.5%", "버터, 바닐라, 오크의 향이 나는 풀바디 화이트 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/7fca6e42-78fc-4713-bf2e-cd0e03036129/image.png"));
        wines.add(new WineRepository("Sauvignon Blanc", "12-13.5%", "상쾌하고 산도가 높으며, 그린애플, 라임의 맛이 나는 화이트 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/64ce5a42-e4cc-4f77-89ab-49883b4fff41/image.png"));
        wines.add(new WineRepository("Riesling", "8-12%", "달콤하거나 드라이하며, 복숭아, 라임의 풍미가 있는 화이트 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/4504b766-7510-4a06-b2ba-152e04d9c6b1/image.png"));
        wines.add(new WineRepository("Syrah/Shiraz", "14-15%", "블랙베리, 후추, 스파이스의 맛이 나는 풀바디 레드 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/84edbe78-2a2a-4598-a635-7812e54cb66e/image.png"));
        wines.add(new WineRepository("Zinfandel", "14-15.5%", "강렬한 과일 맛과 향신료, 토박이 포도의 특징을 지닌 레드 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/457d6484-6c3d-45c0-a50c-ca60339c08b0/image.png"));
        wines.add(new WineRepository("Malbec", "13-15%", "블랙체리, 검은 과일의 풍미가 나는 중간에서 풀바디 레드 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/5fcefd3d-647b-44dd-98b2-5f1277c4bc98/image.png"));
        wines.add(new WineRepository("Sangiovese", "12.5-13.5%", "산딸기, 체리, 허브의 맛이 나는 이탈리아 레드 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/d0bc0a61-4071-4418-ab94-530990db7ebe/image.png"));
        wines.add(new WineRepository("Moscato", "5-7%", "달콤하고 과일 맛이 나며, 낮은 알코올 도수를 가진 화이트 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/8aa2e5a7-a7ec-4341-b701-f8c25d48485f/image.png"));
        wines.add(new WineRepository("Gewürztraminer", "14-15%", "꽃, 열대 과일의 맛이 나며, 향기로운 화이트 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/cfedece1-c68b-4d00-ac7a-fdb051945a45/image.png"));
        wines.add(new WineRepository("Tempranillo", "13.5-14.5%", "체리, 말린 과일, 가죽의 맛이 나는 스페인 레드 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/649a157a-c07f-452e-8a78-f1fd230bb000/image.png"));
        wines.add(new WineRepository("Grenache/Garnacha", "13.5-15%", "딸기, 수박, 스파이스의 맛이 나는 가벼운 레드 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/6b719182-76bd-4d9e-a13f-467b5206be53/image.png"));
        wines.add(new WineRepository("Barbera", "13.5-14.5%", "산딸기, 체리, 허브의 맛이 나는 이탈리아 레드 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/2b1fb1b4-8ce1-42db-b2bf-5b49b3daa210/image.png"));
        wines.add(new WineRepository("Chenin Blanc", "11-14%", "녹색 사과, 꽃, 꿀의 맛이 나는 화이트 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/11b8152c-a681-4de5-b8ef-802f08d27eb9/image.png"));
        wines.add(new WineRepository("Viognier", "13-15%", "복숭아, 살구, 꽃의 맛이 나는 향기로운 화이트 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/f05a60fa-453a-476d-8043-bed0f9ce4061/image.png"));
        wines.add(new WineRepository("Carménère", "13.5-14.5%", "후추, 베리류, 스파이스의 맛이 나는 칠레 레드 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/bda1a958-91bc-40a0-96e1-d060f5ac7feb/image.png"));
        wines.add(new WineRepository("Prosecco", "11-12%", "가볍고 상쾌하며, 그린애플, 멜론의 맛이 나는 이탈리아 스파클링 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/fef84150-df44-4890-89d5-404c0e4f249c/image.png"));
        wines.add(new WineRepository("Port", "19-22%", "달콤하고 높은 알코올 도수를 가진, 건포도와 견과류의 맛이 나는 포르투갈 포트 와인.","https://velog.velcdn.com/images/wkawha_rowk/post/4913c895-00fa-49d5-a527-cea536ec954a/image.png"));
    }

    public List<WineRepository> getAllWines() {
        return wines;
    }

    public List<WineRepository> getAllWinesSortedByABV() {
        wines.sort(Comparator.comparing(WineRepository::getABVAsDouble));
        return new ArrayList<>(wines);
    }

    public List<WineRepository> getAllWinesSortedByName() {
        wines.sort(Comparator.comparing(WineRepository::getName));
        return new ArrayList<>(wines);
    }
}
