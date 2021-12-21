import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {OffresComponent} from "./offres/offres.component";

const routes: Routes = [
  {path:'offres', component: OffresComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
