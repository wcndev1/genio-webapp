import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'author',
        loadChildren: () => import('./author/author.module').then(m => m.GenioWebppAuthorModule),
      },
      {
        path: 'order',
        loadChildren: () => import('./order/order.module').then(m => m.GenioWebppOrderModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class GenioWebppEntityModule {}
