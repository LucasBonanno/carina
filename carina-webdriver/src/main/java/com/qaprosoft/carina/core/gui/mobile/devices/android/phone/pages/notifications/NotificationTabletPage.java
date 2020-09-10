package com.qaprosoft.carina.core.gui.mobile.devices.android.phone.pages.notifications;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("squid:MaximumInheritanceDepth")
@DeviceType(pageType = Type.ANDROID_TABLET, parentClass = NotificationPage.class)
public class NotificationTabletPage extends NotificationPage{
    public NotificationTabletPage(WebDriver driver){
        super(driver);
    }
}
