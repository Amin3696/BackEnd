package at.nacs.reflectionweek3;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Getter
@Setter
@Component
@ConfigurationProperties("handshake")
public class HandshakeLoader {

    private Map<Integer,String> move;

}
