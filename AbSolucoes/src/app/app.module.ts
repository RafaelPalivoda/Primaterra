import { HeaderService } from './header/header.service';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FichaCadastroComponent } from './header/ficha-cadastro/ficha-cadastro.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FichaCadastroComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [ HeaderService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
