package Objects;

import java.util.ArrayList;
import java.util.List;

public class Snippet {
    private String title;
    private String Description;
    private List<Tag> tags = new ArrayList();

    public Snippet() {
    }

    public Snippet(String title, String Description, List<Tag> tags) {
        this.title = title;
        this.Description = Description;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
