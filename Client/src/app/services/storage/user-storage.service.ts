import {Injectable } from '@angular/core';


const TOKEN = 'ecom-token';
const USER = 'ecom-user';


@Injectable({
  providedIn: 'root'
})
export class UserStorageService {

  constructor() { }


  public saveToken(token: string): void {
    localStorage.removeItem(TOKEN);
    localStorage.setItem(TOKEN, token);
  } 

  public saveUser(user): void {
    localStorage.removeItem(USER);
    localStorage.setItem(USER, JSON.stringify(user));
  } 


  static getToken(): string {
    if(typeof localStorage !== 'undefined') {
      console.log(localStorage.getItem(TOKEN));
      return localStorage.getItem(TOKEN);
    }
    return null;
  }


  static getUser(): any {
    if(typeof localStorage !== 'undefined') {
      return JSON.parse(localStorage.getItem(USER));
    }
  }

  static getUserId(): string {
    const user = this.getUser();
    if(user == null) {
      console.log('test');
      return '';
    }
    return user.userId;
  }

  static getUserRole(): string {
    const user = this.getUser();
    if(user == null) {
      return '';
    }
    return user.role;
  }

  // Kiểm tra lượt truy cập

  static isAdminLoggedIn(): boolean {
    if(this.getToken() === null) {
      return false;
    }
    const role: string = this.getUserRole();
    return role == 'Admin';
  }

  static isCustomerLoggedIn(): boolean {
    if(this.getToken() === null) {
      return false;
    }
    const role: string = this.getUserRole();
    return role == 'Customer';
  }

  static signOut(): void {
    localStorage.removeItem(TOKEN);
    localStorage.removeItem(USER);
  }
}
