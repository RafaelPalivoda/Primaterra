import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FichaCadastroComponent } from './ficha-cadastro.component';

describe('FichaCadastroComponent', () => {
  let component: FichaCadastroComponent;
  let fixture: ComponentFixture<FichaCadastroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FichaCadastroComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FichaCadastroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
