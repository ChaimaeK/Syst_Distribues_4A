
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
// @ts-ignore
import { Demande } from '../model/demande';
// @ts-ignore
import { Observable } from 'rxjs/Observable';

@Injectable()
export class DemandeService {

  private demandesUrl: string;

  constructor(private http: HttpClient) {
    this.demandesUrl = 'http://localhost:8080/demandes';
  }

  public findAll(): Observable<Demande[]> {
    return this.http.get<Demande[]>(this.demandesUrl);
  }

  public save(demande: Demande) {
    return this.http.post<Demande>(this.demandesUrl, demande);
  }
}
