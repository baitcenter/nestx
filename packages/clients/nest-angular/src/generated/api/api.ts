export * from './app.service';
import { AppService } from './app.service';
export * from './auth.service';
import { AuthService } from './auth.service';
export * from './cms.service';
import { CmsService } from './cms.service';
export * from './core.service';
import { CoreService } from './core.service';
export * from './default.service';
import { DefaultService } from './default.service';
export * from './mock.service';
import { MockService } from './mock.service';
export const APIS = [AppService, AuthService, CmsService, CoreService, DefaultService, MockService];