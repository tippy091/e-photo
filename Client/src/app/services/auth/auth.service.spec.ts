import { TestBed } from '@angular/core/testing';

import { AuthService } from './auth.service';
import 'localstorage-polyfill';
global['localStorage'] = localStorage;

describe('AuthService', () => {
  let service: AuthService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AuthService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
