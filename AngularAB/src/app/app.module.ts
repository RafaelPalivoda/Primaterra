import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PaginaLoginComponent } from './pagina-login/pagina-login.component';
import { LoginHeaderComponent } from './pagina-login/login-header/login-header.component';
import { LoginFooterComponent } from './pagina-login/login-footer/login-footer.component';
import { LoginAppComponent } from './pagina-login/login-app/login-app.component';

@NgModule({
  declarations: [
    AppComponent,
    PaginaLoginComponent,
    LoginHeaderComponent,
    LoginFooterComponent,
    LoginAppComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
