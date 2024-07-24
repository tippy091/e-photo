import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { AuthService } from '../services/auth/auth.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrl: './signup.component.scss'
})
export class SignupComponent {

  signupForm!: FormGroup;
  hidePassword = true;

  constructor(private fb: FormBuilder,
    private snackBar: MatSnackBar,
    private authService: AuthService,
    private router: Router) {
      
    }

    ngOnInit(): void {
      this.signupForm = this.fb.group({
        name: [null, [Validators.required]],
        email: [null, [Validators.required, Validators.email]],
        password: [null, [Validators.required]],
        confirmPassword: [null, [Validators.required]],
      })
    }


    togglePasswordVisibility() {
      this.hidePassword = !this.hidePassword;
    }

    onSubmit(): void {
      const password = this.signupForm.get('password')?.value;
      const confirmPassword = this.signupForm.get('confirmPassword')?.value;
      if (this.signupForm.valid) {

        if(password != confirmPassword) {
          this.snackBar.open('Password do not match.', 'Close', { duration : 5000, panelClass: 'error-snackbar' });
          return;
        }

        this.authService.register(this.signupForm.value).subscribe({
          next: (response) => {
            console.log('Sign up Successful:', response);
            this.snackBar.open('Sign up Successful!', 'Close', { duration: 5000 });
            this.router.navigateByUrl('/login');
          },
          error: (error) => {
            console.error('Sign up Failed:', error);
            this.snackBar.open('Sign up Failed, please try again.', 'Close', { duration: 5000, panelClass: 'error-snackbar' });
          }
        });
      } else {
        console.log('Form is invalid');
        this.snackBar.open('Form is invalid. Please check your input.', 'Close', { duration: 5000, panelClass: 'error-snackbar' });
      }
    }
}
