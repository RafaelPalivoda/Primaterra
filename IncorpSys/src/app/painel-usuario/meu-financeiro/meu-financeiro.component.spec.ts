import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MeuFinanceiroComponent } from './meu-financeiro.component';

describe('MeuFinanceiroComponent', () => {
  let component: MeuFinanceiroComponent;
  let fixture: ComponentFixture<MeuFinanceiroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MeuFinanceiroComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MeuFinanceiroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
