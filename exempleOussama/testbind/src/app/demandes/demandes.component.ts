import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-demandes',
  templateUrl: './demandes.component.html',
  styleUrls: ['./demandes.component.css']
})
export class DemandesComponent implements OnInit {

  public demandes:any;
  constructor(private httpClient: HttpClient) { }

  ngOnInit() {
  }

  onGetDemandes() {
    this.httpClient.get('http://localhost:9797/demandes')
      .subscribe(data=>{
        this.demandes=data;
      },err=>{
        console.log(err);
      })
  }
  deleteDemande(idp:any){
    return this.httpClient.delete('http://localhost:9797/demandes/'+idp);
  }


  onDeleteDemande(o:any) {
    let conf =confirm("Etes vous sûr?");
    if(conf){
      this.deleteDemande(o)
        .subscribe(data=>{
            this.onGetDemandes();
        },err=>{
            console.log(err);
        })
    }
  }
}
