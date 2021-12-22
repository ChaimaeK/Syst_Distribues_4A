
import { Component, OnInit } from '@angular/core';
import { Demande } from '../model/demande';
import { DemandeService } from '../service/demande.service';

@Component({
  selector: 'app-demandes',
  templateUrl: './demandes.component.html',
  styleUrls: ['./demandes.component.css']
})
export class DemandesComponent implements OnInit {

  demandes: Demande[];

  constructor(private demandeService: DemandeService) {
  }

  ngOnInit() {
    this.demandeService.findAll().subscribe(data => {
      this.demandes = data;
    });
  }
}

