import { Observable } from 'rxjs';
import { Product } from './product.model';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  baseUrl = "https://backend-ppk.herokuapp.com/api/contact/"

  constructor(private snackBar: MatSnackBar,private http: HttpClient) { }

  showMessage(msg: string): void {
    this.snackBar.open(msg, 'X', {
      duration: 3000,
      horizontalPosition: "right",
      verticalPosition: "top"
    })
  }


  create(product: Product): Observable<Product>{
    return this.http.post<Product>(this.baseUrl, product)
  }


}
