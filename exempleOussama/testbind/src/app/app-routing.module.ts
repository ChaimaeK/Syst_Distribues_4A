import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {DemandesComponent} from "./demandes/demandes.component";

const routes: Routes = [
  {path:'demandes', component: DemandesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
