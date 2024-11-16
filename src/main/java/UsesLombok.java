import lombok.Data;

@Data
public class UsesLombok implements Comparable<UsesLombok> {

    private String version;
    private String date;
    private boolean isFinal = true;

    @Override
    public int compareTo(UsesLombok o) {
        return version.compareTo(o.getVersion());
    }
}
