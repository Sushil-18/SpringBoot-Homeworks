package github.codingShuttle.Springboot_Homework_1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "cake.syrup", havingValue = "Chocolate")
public class ChocolateSyrup implements Syrup{
    @Override
    public String getSyrup() {
        return "Chocolate Syrup";
    }
}
