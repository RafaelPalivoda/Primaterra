import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PaginaLoginComponent } from './pagina-login/pagina-login.component';
import { LoginHeaderComponent } from './pagina-login/login-header/login-header.component';
import { LoginFooterComponent } from './pagina-login/login-footer/login-footer.component';
import { LoginAppComponent } from './pagina-login/login-app/login-app.component';
import { PainelUsuarioComponent } from './painel-usuario/painel-usuario.component';
import { RouterModule } from '@angular/router';
import appRoutes from './routerConfig';


@NgModule({
  declarations: [
    AppComponent,
    PaginaLoginComponent,
    LoginHeaderComponent,
    LoginFooterComponent,
    LoginAppComponent,
    PainelUsuarioComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
