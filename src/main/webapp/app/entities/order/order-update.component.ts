import { Component, OnInit } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
// eslint-disable-next-line @typescript-eslint/no-unused-vars
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';

import { IOrder, Order } from 'app/shared/model/order.model';
import { OrderService } from './order.service';

@Component({
  selector: 'jhi-order-update',
  templateUrl: './order-update.component.html',
})
export class OrderUpdateComponent implements OnInit {
  isSaving = false;
  startDateDp: any;
  endDateDp: any;
  createDateDp: any;
  updateDateDp: any;
  updateByDp: any;

  editForm = this.fb.group({
    id: [],
    orderId: [],
    orderCode: [],
    custId: [],
    productId: [],
    startDate: [],
    endDate: [],
    activeFlag: [],
    createDate: [],
    createBy: [],
    updateDate: [],
    updateBy: [],
  });

  constructor(protected orderService: OrderService, protected activatedRoute: ActivatedRoute, private fb: FormBuilder) {}

  ngOnInit(): void {
    this.activatedRoute.data.subscribe(({ order }) => {
      this.updateForm(order);
    });
  }

  updateForm(order: IOrder): void {
    this.editForm.patchValue({
      id: order.id,
      orderId: order.orderId,
      orderCode: order.orderCode,
      custId: order.custId,
      productId: order.productId,
      startDate: order.startDate,
      endDate: order.endDate,
      activeFlag: order.activeFlag,
      createDate: order.createDate,
      createBy: order.createBy,
      updateDate: order.updateDate,
      updateBy: order.updateBy,
    });
  }

  previousState(): void {
    window.history.back();
  }

  save(): void {
    this.isSaving = true;
    const order = this.createFromForm();
    if (order.id !== undefined) {
      this.subscribeToSaveResponse(this.orderService.update(order));
    } else {
      this.subscribeToSaveResponse(this.orderService.create(order));
    }
  }

  private createFromForm(): IOrder {
    return {
      ...new Order(),
      id: this.editForm.get(['id'])!.value,
      orderId: this.editForm.get(['orderId'])!.value,
      orderCode: this.editForm.get(['orderCode'])!.value,
      custId: this.editForm.get(['custId'])!.value,
      productId: this.editForm.get(['productId'])!.value,
      startDate: this.editForm.get(['startDate'])!.value,
      endDate: this.editForm.get(['endDate'])!.value,
      activeFlag: this.editForm.get(['activeFlag'])!.value,
      createDate: this.editForm.get(['createDate'])!.value,
      createBy: this.editForm.get(['createBy'])!.value,
      updateDate: this.editForm.get(['updateDate'])!.value,
      updateBy: this.editForm.get(['updateBy'])!.value,
    };
  }

  protected subscribeToSaveResponse(result: Observable<HttpResponse<IOrder>>): void {
    result.subscribe(
      () => this.onSaveSuccess(),
      () => this.onSaveError()
    );
  }

  protected onSaveSuccess(): void {
    this.isSaving = false;
    this.previousState();
  }

  protected onSaveError(): void {
    this.isSaving = false;
  }
}
