import lombok.Data;

@SuppressWarnings("unused")
@Data
public class UsesLombok implements Comparable<UsesLombok> {

    private String version;

    @Override
    public int compareTo(UsesLombok o) {
        return version.compareTo(o.getVersion());
    }
}
