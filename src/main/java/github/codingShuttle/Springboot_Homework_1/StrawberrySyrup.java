package github.codingShuttle.Springboot_Homework_1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "cake.syrup", havingValue = "Strawberry")
public class StrawberrySyrup implements Syrup{
    @Override
    public String getSyrup() {
        return "Strawberry Syrup";
    }
}
