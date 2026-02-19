package AlexaDevice_2;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class AlexaDeviceTest {

    @Test
    @DisplayName("Should show Charging status and Battery Percentage")
    public void DeviceWithActiveChargingStatusAndWithBatteryPercentage_Test() throws InvalidDeviceException{
        AlexaDevice device = AlexaDeviceFactory.createAlexaDevice(DeviceType.ECHO_DOT, 50, true);
        System.out.println(device.getDeviceStatus());
    }

    @Test
    @DisplayName("Should show NonCharging status and Battery Percentage")
    public void DeviceWithPassiveChargingStatusAndWithBatteryPercentage_Test() throws InvalidDeviceException {
        AlexaDevice device = AlexaDeviceFactory.createAlexaDevice(DeviceType.ECHO_DOT, 50, false);
        System.out.println(device.getDeviceStatus());
    }

    @Test
    @DisplayName("Should show Charging status and Battery not available")
    public void DeviceWithActiveChargingStatusAndWithNoBatteryAvailable_Test() throws InvalidDeviceException {
        AlexaDevice device = AlexaDeviceFactory.createAlexaDevice(DeviceType.ECHO_DOT, -1, true );
        System.out.println(device.getDeviceStatus());
    }

    @Test
    @DisplayName("Should show NonCharging status and Battery not available")
    public void DeviceWithPassiveChargingStatusAndWithBatteryNotAvailable_Test() throws InvalidDeviceException {
        AlexaDevice device = AlexaDeviceFactory.createAlexaDevice(DeviceType.ECHO_DOT, -1, false);
        System.out.println(device.getDeviceStatus());
    }

    @Test
    @DisplayName("Should throw inalid device request exception")
    public void ShouldThrowInvalidDeviceRequestException(){
        Assertions.assertThrows(InvalidDeviceException.class, ()-> AlexaDeviceFactory.createAlexaDevice(null, -1,true));
    }
}
