import { PainelUsuarioComponent } from './painel-usuario/painel-usuario.component';
import { PaginaLoginComponent } from './pagina-login/pagina-login.component';
import { Routes } from '@angular/router';

const appRoutes: Routes = [
    { path: 'login', 
      component: PaginaLoginComponent 
    },
    { path: 'painel-usuario',
      component: PainelUsuarioComponent
    }
  ];
  export default appRoutes;