
@ApplicationModule(
        allowedDependencies = {"login::LoginService","login::LoginDTO","common::common-validator","notification::NotificationService","common::common-events"}
)
package com.dzone.demo.userauthentication.userregistration;

import org.springframework.modulith.ApplicationModule;