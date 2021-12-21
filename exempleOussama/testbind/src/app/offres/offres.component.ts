import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-offres',
  templateUrl: './offres.component.html',
  styleUrls: ['./offres.component.css']
})
export class OffresComponent implements OnInit {

  public offres:any;
  constructor(private httpClient: HttpClient) { }

  ngOnInit() {
  }

  onGetOffres() {
    this.httpClient.get('http://localhost:9797/offres')
      .subscribe(data=>{
        this.offres=data;
      },err=>{
        console.log(err);
      })
  }
  deleteOffre(idp:any){
    return this.httpClient.delete('http://localhost:9797/offres/'+idp);
  }


  onDeleteOffre(o:any) {
    let conf =confirm("Etes vous sûr?");
    if(conf){
      this.deleteOffre(o)
        .subscribe(data=>{
            this.onGetOffres();
        },err=>{
            console.log(err);
        })
    }
  }
}
