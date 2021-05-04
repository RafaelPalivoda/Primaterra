import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';
import { MatMenuModule } from '@angular/material/menu';
import { PaginaInicialComponent } from './pagina-inicial/pagina-inicial.component';
import { PainelUsuarioComponent } from './painel-usuario/painel-usuario.component';
import { NavbarComponent } from './painel-usuario/navbar/navbar.component';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { MatSelectModule } from '@angular/material/select';
import { FormsModule } from '@angular/forms';
import { MatTabsModule } from '@angular/material/tabs';
import { CadastrarEntidadeComponent } from './painel-usuario/cadastrar-entidade/cadastrar-entidade.component';
import { MinhasAreasComponent } from './painel-usuario/minhas-areas/minhas-areas.component';
import { MeuFinanceiroComponent } from './painel-usuario/meu-financeiro/meu-financeiro.component';

@NgModule({
  declarations: [
    AppComponent,
    PaginaInicialComponent,
    PainelUsuarioComponent,
    NavbarComponent,
    CadastrarEntidadeComponent,
    MinhasAreasComponent,
    MeuFinanceiroComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatSidenavModule,
    MatToolbarModule,
    MatSidenavModule,
    MatIconModule,
    MatButtonModule,
    MatMenuModule,
    MatCheckboxModule,
    MatSelectModule,
    FormsModule,
    MatTabsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
