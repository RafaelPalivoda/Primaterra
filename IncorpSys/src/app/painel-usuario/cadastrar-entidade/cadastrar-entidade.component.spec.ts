import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastrarEntidadeComponent } from './cadastrar-entidade.component';

describe('CadastrarEntidadeComponent', () => {
  let component: CadastrarEntidadeComponent;
  let fixture: ComponentFixture<CadastrarEntidadeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CadastrarEntidadeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CadastrarEntidadeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
