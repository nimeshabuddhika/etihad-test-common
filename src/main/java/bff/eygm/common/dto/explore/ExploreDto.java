package bff.eygm.common.dto.explore;

public class ExploreDto {

    private String code;
    private String title;
    private String desc;
    private String img;
    private String content;

    public ExploreDto() {
    }

    public ExploreDto(String code, String title, String img) {
        this.code = code;
        this.title = title;
        this.img = img;
    }

    public ExploreDto(String code, String title, String desc, String img) {
        this.code = code;
        this.title = title;
        this.desc = desc;
        this.img = img;
    }

    public ExploreDto(String code, String title, String desc, String img, String content) {
        this.code = code;
        this.title = title;
        this.desc = desc;
        this.img = img;
        this.content = content;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        ExploreDto cell = (ExploreDto) obj;
        return this.code.equals(cell.getCode());
    }
}

