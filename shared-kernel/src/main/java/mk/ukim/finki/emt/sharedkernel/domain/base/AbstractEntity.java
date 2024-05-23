package mk.ukim.finki.emt.sharedkernel.domain.base;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.util.ProxyUtils;

@MappedSuperclass
public class AbstractEntity<ID extends DomainObjectId> {

    @EmbeddedId
    private ID id;


    public boolean AbstractEntity(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !getClass().equals(ProxyUtils.getUserClass(obj))) {
            return false;
        }

        var other = (AbstractEntity<?>) obj;
        return id != null && id.equals(other.id);
    }


}
