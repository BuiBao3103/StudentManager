﻿--Tạo cơ sở dữ liệu quản lý sinh viên
drop database quanlysinhvien
Create database quanlysinhvien
Go
use quanlysinhvien
Go
--Tạo bảng Sinh Viên
Create table SINHVIEN(
MaSV nvarchar(10) not null primary key,
Cmnd char(12) not null unique,
HoTen nvarchar(50),
NgaySinh date,
GioiTinh nvarchar(3),
DiaChi nvarchar(50),
DanToc nvarchar(10),
TonGiao nvarchar(10) ,
NienKhoa nvarchar(10),
MaNganh nvarchar(10),
MaTK int
)
Go

-- Tạo bảng Học Phần
Create table HOCPHAN(
MaHP nvarchar(10) not null primary key,
TenMon nvarchar(50),
TinChi int ,
ChuyenBiet int,
PhanTramQuaTrinh nvarchar(10),
MaKhoa nvarchar(10),
MaNganh nvarchar(10)
)

Go
-- Tạo bảng điều kiện học phần
Create table DIEUKIEN(
MaHP nvarchar(10),
MaHP_Truoc nvarchar(10),
primary key(MaHP,MaHP_Truoc)

)
Go
--Taọ bảng Đăn ký môn học
create table NHOM(
MaHP nvarchar(10) not null,
SoNhom int not null,
HocKy int not null,
Nam int not null,
MaGV nvarchar(10),
Phong nvarchar(10),
SoSinhVien int ,
Thu nvarchar(10),
TietBD int,
SoTiet int,
primary key(MaHP,SoNhom,HocKy,Nam)
)
select * from Nhom

Go
--Tạo bảng Khoa
Create table KHOA(
MaKhoa nvarchar(10) not null primary key,
TenKhoa nvarchar(50),
MaTK int 
)

Go
--Tạo bảng Giảng Viên
Create table GIANGVIEN(
MaGV nvarchar(10) not null primary key,
TenGV nvarchar(50),
MaTK int
) 
Go
--Tạo bảng Kết Quả
Create table KETQUA(
MaSV nvarchar(10) not null,
MaHP nvarchar(10) not null,
SoNhom int not null,
HocKy int not null,
Nam int not null,
DiemQuaTrinh float,
DiemCuoiKy float,
Primary key(MaSV,MaHP,SoNhom,HocKy,Nam),
)
select * from ketqua
Go
--Tao bang Ngành
Create table NGANH(
MaNganh nvarchar(10) not null primary key,
TenNganh nvarchar(50),
MaKhoa nvarchar(10)
)
Go
--Tạo bảng Tài Khoản
Create table TAIKHOAN(
MaTK int not null primary key,
TenTaiKhoan nvarchar(10),
MatKhau nvarchar(50),
MaNhomQuyen nvarchar(10)
)
Go
--Taọ bảng nhóm quyền 
Create table NHOMQUYEN(
MaNhomQuyen nvarchar(10) not null primary key,
TenNhomQuyen nvarchar(50),
)
Go
--Tạo bảng chi tiết quyền
Create table CHITIETQUYEN(
MaQuyen nvarchar(10) not null primary key,
TenQuyen nvarchar(50),
MaNhomQuyen nvarchar(10)
)
Go
-- Tạo bảng nhóm quyền chi tiết quyền 
Create table NQ_CTQ(
MaNhomQuyen nvarchar(10),
MaQuyen nvarchar(10),
primary key(MaNhomQuyen,MaQuyen)
)

					-----====================== Thêm dữ liệu cho bảng ----======================
					-----======================		Nhóm Quyền	 ======================
Insert into NHOMQUYEN values
('Q1','admin'),
('Q2','Khoa'),
('Q3','GiangVien'),
('Q4','SinhVien')
Insert into CHITIETQUYEN values
('','','')
					-----======================		Tài Khoản	 ======================
Insert into  TAIKHOAN values
(1,'admin','admin','Q1'),
(2,'CNTT','12345678','Q2'),
(3,'NN','12345678','Q2'),
(4,'GDCT','12345678','Q2'),
(5,'SPKHTN','12345678','Q2'),
(6,'QTKD','12345678','Q2'),
(7,'TCKT','12345678','Q2'),
(10,'11384','12345','Q3'),
(11,'11271','12345','Q3'),
(12,'10991','12345','Q3'),
(13,'11364','12345','Q3'),
(14,'10631','12345','Q3'),
(15,'20766','12345','Q3'),
(16,'11453','12345','Q3'),
(17,'11556','12345','Q3'),
(18,'11206','12345','Q3'),
(19,'11232','12345','Q3'),
(100,'3121410482','123456','Q4'),
(101,'3121410066','123456','Q4'),
(102,'3121410379','123456','Q4'),
(103,'3121410502','123456','Q4')








					-----======================		Sinh Vien	 ======================
set dateformat dmy
					---=== Ngành Công Nghệ Thông Tin ===---
Insert into SINHVIEN values
('3121410482','001002003001',N'Nguyễn Minh Thuận','04/09/2003','Nam',N'Tiền Giang','Kinh','Không','2021-2026','DCT','100'),
('3121410066','002002003002',N'Bùi Hông Bảo','31/03/2003','Nam',N'Tiền Giang','Kinh','Không','2021-2026','DCT','101'),
('3121410379','003002003003',N'Nguyễn Tiến Phát','03/04/2003','Nam',N'Quảng Ngãi','Kinh','Không','2021-2026','DCT','102'),
('3121410502','004002003004',N'Phan Huỳnh Minh Tiến','04/05/2003','Nam',N'Hà Nội','Kinh','Không','2021-2026','DCT','103'),
('3121410533','004002003004',N'Nguyễn Thị Phương Trúc','24/03/2003','Nữ',N'Hà Nội','Kinh','Không','2021-2026','DCT','132'),

					---=== Ngành Kĩ Thuật Phần Mềm ===---
('3121560051','005002003005',N'Nguyễn Hoàng Luân','12/05/2001','Nam',N'TP.HCM','Kinh','Không','2019-2024','DKP','104'),
('3121560061','006002003006',N'Phạm Văn Nghĩa','14/05/2002','Nam',N'Đà nẵng','Kinh','Không','2020-2025','DKP','105'),
('3121560020','007002003007',N'Nguyễn Tiến Danh','22/05/2003','Nam',N'Huế','Kinh','Không','2021-2026','DKP','106'),
('3121560023','008002003008',N'Võ Khương Duy','26/03/2003','Nam',N'Bình Định','Kinh','Không','2021-2026','DKP','107'),
					---=== Ngành Ngôn Ngữ Anh ===---
('3121380077','009002003009',N'Trần Hương Giang','10/05/2002','Nữ',N'TP.HCM','Kinh','Không','2020-2025','DAN','108'),
('3121380238','010002003010',N'Phạm Ngân Quỳnh	','01/06/2003','Nữ',N'Long An','Kinh','Không','2021-2026','DAN','109'),
('3121380291','011002003011',N'Dương Ngọc Trâm','02/06/2001','Nữ',N'Cần Thơ','Kinh','Không','2019-2024','DAN','110'),
('3121380003','012002003012',N'Mai Thị Phương Nhi','04/08/2003','Nữ',N'An Giang','Kinh','Không','2021-2026','DAN','111'),
					---=== Ngành Kinh Doanh Quốc Tế ===---
('3121550056','013002003013',N'Hồ Thị Cẩm Nhung','05/11/2003','Nữ',N'An Giang','Kinh','Không','2021-2026','DKQ','112'),
('3121550026','013002003014',N'Trương Thị Mai Hân','08/01/2004','Nữ',N'Đồng Tháp','Kinh','Không','2022-2027','DKQ','113'),
('3121550059','013002003015',N'Huỳnh Ngọc Như','07/07/2002','Nữ',N'Phú Yên','Kinh','Không','2020-2025','DKQ','114'),
('3121550069','013002003016',N'Nguyễn Phương Oanh','08/09/2003','Nữ',N'Nghệ An','Kinh','Không','2021-2026','DKQ','115'),
					---=== Ngành Quản Trih Kinh Doanh ===---
('3121330094','013002003017',N'Ngô Lê Thành Đạt','09/06/2003','Nam',N'Hà Tĩnh','Kinh','Không','2021-2026','DQK','116'),
('3121330058','013002003018',N'Lê Minh Châu','11/02/2003','Nữ',N'TP.HCM','Kinh','Không','2020-2025','DQK','117'),
('3121330122','013002003019',N'Nguyễn Lê Ngọc Hân','22/05/2003','Nữ',N'Hà Nội','Kinh','Không','2022-2027','DQK','118'),
('3121330217','013002003020',N'Nguyễn Huyền My','25/04/2003','Nữ',N'Tây Ninh','Kinh','Không','2019-2024','DQK','119'),
					---=== Ngành Sư Phạm Tiếng Anh ===---
('3121130095','013002003021',N'Trần Nữ Minh Ngọc','01/09/2003','Nữ',N'Đà Nẵng','Kinh','Không','2021-2026','DSA','120'),
('3121130101','013002003022',N'Nguyễn Thị Yến Nhi','03/10/2002','Nữ',N'Lâm Đồng','Kinh','Không','2022-2026','DSA','121'),
('3121130104','013002003023',N'Nguyễn Quỳnh Như','01/11/2003','Nữ',N'TP.HCM','Kinh','Không','2021-2026','DSA','122'),
('3121130131','013002003024',N'Nguyễn Lê Hoàng Thi','07/09/2003','Nữ',N'Vũng Tàu','Kinh','Không','2021-2026','DSA','123'),
					---=== Ngành Tài Chính - Ngân Hàng ===---
('3121420071','013002003025',N'Nguyễn Thành Công','01/12/2003','Nam',N'Vũng Tàu','Kinh','Không','2021-2026','DTN','124'),
('3121420147','013002003026',N'Phạm Bá Huy','07/03/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DTN','125'),
('3121420351','013002003027',N'Trần Diễm Quỳnh','08/04/2003','Nữ',N'TP.HCM','Kinh','Không','2021-2026','DTN','126'),
('3121420482','013002003028',N'Phạm Mỹ Uyên','22/10/2003','Nữ',N'Hà Nội','Kinh','Không','2021-2026','DTN','127'),
					---=== Ngành Kế Toán ===---
('3121320137','013002003029',N'Nguyễn Thị Ngọc Huyền','04/12/2003','Nữ',N'Vũng Tàu','Kinh','Không','2022-2027','DTN','128'),
('3121320408','013002003030',N'Huỳnh Thanh Mai Thy','09/01/2003','Nữ',N'TP.HCM','Kinh','Không','2021-2026','DTN','129'),
('3121320355','013002003031',N'Nguyễn Thanh Thanh','18/03/2003','Nữ',N'TP.HCM','Kinh','Không','2021-2026','DTN','130'),
('3121320439','013002003032',N'Bùi Thị Ngọc Trâm','22/11/2003','Nữ',N'Hà Nội','Kinh','Không','2021-2026','DTN','131')




					-----======================		KHOA	 ======================
Insert into KHOA  values
('CNTT',N'Công Nghệ Thông Tin',2),
('NN',N'Ngoại Ngữ',3),
('GDCT',N'Giáo Dục Chính Trị',4),
('SPKHTN',N'Sư Phạm Khoa Học Tự Nhiên',5),
('QTKD',N'Quản Trị Kinh Doanh',6),
('TCKT',N'Tài Chính Kế Toán',7),
('QPAN&GDTC',N'Giáo Dục Quốc Phòng An Ninh và Giáo Dục Thể Chất',8)




					-----======================		Ngành	 ======================
Insert into NGANH values
('DCT',N'Công Nghệ Thông Tin','CNTT'),
('DKP',N'Kĩ Thuật Phần Mềm','CNTT'),
('DAN',N'Ngôn Ngữ Anh','NN'),
('DSA',N'Sư Phạm Tiếng Anh','NN'),
('DQK',N'Quản Trị Kinh Doanh','QTKD'),
('DKQ',N'Kinh Doanh Quốc Tế','QTKD'),
('DSI',N'Sư Phạm Sinh Học','SPKHTN'),
('DKH',N'Sư Phạm Khoa Học Tự Nhiên','SPKHTN'),
('DLI',N'Sư Phạm Lí','SPKHTN'),
('DHO',N'Sư Hóa','SPKHTN'),
('DTN',N'Tài Chính - Ngân Hàng','TCKT'),
('DKE',N'Kế Toán','TCKT')


					-----======================		Giảng Viên	 ======================
Insert into GIANGVIEN values
('11384',N'Trương Tấn Khoa',10),
('11271',N'Nguyễn Thị Hồng Anh',11),
('10991',N'Nguyễn Thanh Sang',12),
('11364',N'Lương Minh Huấn',13),
('10631',N'Phan Tấn Quốc',14),
('20766',N'Huỳnh Minh Trí',15),
('11453',N'Nguyễn Tuấn Đăng',16),
('11556',N'Huỳnh Nguyễn Khắc Huy',17),
('11541',N'Phan Nguyệt Minh',18),
('20666',N'Trần Sơn Hải',19),
('20727',N'Nguyễn Hữu Quang',20),
('11377',N'Nguyễn Trung Tín',21),
('11636',N'Từ Lãng Phiêu',22),
('20454',N'Trần Công Hùng',23),
('11363',N'Lê Thị Nhãm Thúy',24),
('11426',N'Phạm Thị Vương',25),
('20772',N'Võ Hoàng Hải',26),
('10600',N'Nguyễn Quốc Huy',27),
('20704',N'Nguyễn Tấn Công',28),
('11637',N'Nguyễn Lê Thanh Trúc',29),
('10227',N'Phùng Thái Thiên Trang',30),
('11041',N'Đỗ Ngọc Như Loan',31),
('20774',N'Hồ Đắc Quán',32),
('10943',N'Nguyễn Hòa',33),
('11474',N'Vũ Ngọc Thanh Sang',34),
('20239',N'Vũ Thanh Hiền',34),
('20770',N'Trần Thanh Nhã',35),
('10063',N'Lai Đình Khải',36),
('11544',N'Hà Thanh Dũng',37),
('10409',N'Phạm Hoàng Vương',38),
('11383',N'Trịnh Tấn Đạt',39),
('10094',N'Cổ Tồn Minh Đăng',40),
('11562',N'Nguyễn Quốc Phong',41),
('10135',N'Trần Thanh Bình',42),
('11107',N'Lê Minh Tuấn',43),
('11489',N'Trần Đức Thành',44),
('10873',N'Phan Trung Hiếu',45),
('10935',N'Lê Thị Tuyết Ngọc',46),
('10131',N'Bùi Đình Thắng',47),
('10944',N'Nguyễn Võ Lam Giang',48),
('20764',N'Mai Vân Phương Vũ',49),
('20609',N'Văn Thế Thành',50),
('10011',N'Cao Minh Thành',51),
('20771',N'Huỳnh Hồ Thị Mộng Trinh',52)

--('11206',N'Nguyễn Thị Hương Giang',18),
--('11232',N'Nguyễn Thị Lệ Giang',19),

--('10761',N'Trần Thế Phi',20),
--('11076',N'Nguyễn Quang Minh Triết',21),
--('11318',N'Hà Nguyễn Tuyết Minh',22),
--('11304',N'Bùi Nguyễn Nguyệt Minh',23),
--('11548',N'Nguyễn Lê Thanh GIang',24),
--('11282',N'Lê Hà Tố Quyên',25),
--('11476',N'Đỗ Tiến Lộc',26)

					-----======================		Học Phần	 ======================

Insert into HOCPHAN values
('861301',N'Triết học Mác-Lênin',3,0,'40%','GDCT',null),
('861302',N'Kinh Tế Chính Trị Mác-Lênin',2,0,'40%','GDCT',null),
('861303',N'Chủ Nghĩa Xã Hội Khoa Học',2,0,'40%','GDCT',null),
('861304',N'Tư Tưởng Hồ Chí Minh',2,0,'40%','GDCT',null),
('861305',N'Lịch Sử Đảng Cộng Sản Việt Nam',2,0,'40%','GDCT',null),
('866101',N'Tiếng Anh I',2,0,'40%','NN',null),
('866102',N'Tiếng Anh II',2,0,'40%','NN',null),
('866103',N'Tiếng Anh III',3,0,'40%','NN',null),
('865006',N'Pháp Luật Đại Cương',2,0,'40%','GDCT',null),
('862101',N'Giáo Dục Thể Chất(I)',1,0,'40%','GDCT',null),
('862406',N'Giáo Dục Quốc Phòng An Ninh I',3,0,'40%','QPAN&GDTC',null),
('862407',N'Giáo Dục Quốc Phòng An Ninh II',2,0,'40%','QPAN&GDTC',null),
('862408',N'Giáo Dục Quốc Phòng An Ninh III',2,0,'40%','QPAN&GDTC',null),
('862409',N'Giáo Dục Quốc Phòng An Ninh IV',4,0,'40%','QPAN&GDTC',null),

('841405',N'Xác Xuât Thống Kê',3,1,'40%','CNTT',null),
('841401',N'Giải Tích 1',3,1,'40%','CNTT',null),
('841406',N'Giải Tích 2',3,1,'40%','CNTT',null),
('841402',N'Đại Số Tuyến Tính',3,1,'40%','CNTT',null),
('841020',N'Cơ Sở Lập Trình',3,1,'50%','CNTT',null),
('841303',N'Kỹ Thuật Lập Trình',4,1,'50%','CNTT',null),
('841021',N'Kiến Trúc Máy Tính',3,1,'50%','CNTT',null),
('841022',N'Hệ Điều Hành',3,1,'50%','CNTT',null),
('841403',N'Cấu Trúc Rời Rạc',4,1,'40%','CNTT',null),
('841108',N'Cấu Trúc Dữ Liệu và Giải Thuật',4,1,'50%','CNTT',null),
('841404',N'Mạng Máy Tính',3,1,'50%','CNTT',null),
('841044',N'Lập Trình Hướng Đối Tượng',4,1,'50%','CNTT',null),
('841109',N'Cơ Sở Dữ Liệu',4,1,'50%','CNTT',null),
('841100',N'Cơ Sở Trí Tuệ Nhân Tạo',4,1,'50%','CNTT',null),
('841310',N'Lý Thuyết Đồ Thị',3,2,'50%','CNTT','DCT'),
('841414',N'Thiết Kế Phân Tích Giải Thuật',3,2,'50%','CNTT','DCT'),
('841047',N'Công Nghệ Phần Mềm',4,1,'50%','CNTT',null),
('841048',N'Phân Tích Thiết Kế HTTT',4,1,'50%','CNTT',null),
('841058',N'Hệ Điều Hành Mã Nguồn Mở',3,1,'50%','CNTT',null),
('841419',N'Lập Trình Web và Ứng Dụng',4,1,'50%','CNTT',null),
('841420',N'Lập trình trực quan',4,1,'50%','CNTT',null),
('841422',N'Ngôn ngữ lập trình Python',4,1,'50%','CNTT',null),
('841423',N'Ngôn ngữ lập trình C#',4,1,'50%','CNTT',null),
('841107',N'Ngôn ngữ lập trình Java',4,1,'50%','CNTT',null),
('841424',N'Phương pháp mô hình hóa',3,1,'50%','CNTT',null),
('841429',N'Cơ sở dữ liệu nâng cao',4,1,'50%','CNTT','DCT'),
('841407',N'Các hệ quản trị cơ sở dữ liệu',4,1,'50%','CNTT',null),
('841418',N'Mô Hình Tài Chính',3,2,'50%','CNTT','DCT'),
('841426',N'Quản Lý và Bảo Mật Dữ Liệu',3,2,'50%','CNTT','DCT'),
('841413',N'Cơ Sở Dữ Liệu Phân Tán',4,2,'50%','CNTT','DCT'),
('841111',N'Phân Tích Thiết Kế Hướng Đối Tượng',4,1,'50%','CNTT',null),
('841120',N'An Toàn và Bảo Mật Dữ Liệu Trong HTTT',3,1,'50%','CNTT',null),
('841068',N'HTTT Doanh Nghiệp',3,1,'50%','CNTT',null),
('841412',N'Nguyên Lý và Phương Pháp Lập Trình',4,1,'50%','CNTT',null),
('841432',N'Phân Tích Dữ Liệu',4,2,'50%','CNTT','DCT'),
('841433',N'Các Hệ Thống Cơ Sở Dữ Liệu',4,1,'50%','CNTT',null),
('841434',N'Thương Mại Điện Tử và Ứng Dụng',4,1,'50%','CNTT',null),
('841435',N'Hệ Hỗ Trợ Quyết Đinh',4,2,'50%','CNTT','DCT'),
('841409',N'Mạng Máy Tính Nâng Cao',4,2,'50%','CNTT','DCT'),
('841438',N'Lập Trình Ứng Dụng Mạng',4,2,'50%','CNTT','DCT'),
('841411',N'Quản Trị Mạng',4,1,'50%','CNTT',null),
('841410',N'An Ninh Mạng Máy Tính',4,1,'50%','CNTT',null),
('841439',N'Mạng Không Dây',4,2,'50%','CNTT','DCT'),
('841440',N'Phân Tích và Thiết Kế Mạng Máy Tính',4,2,'50%','CNTT','DCT'),
('841437',N'Các Giải Thuật Phân Tán',4,2,'50%','CNTT','DCT'),
('841441',N'Đánh Giá Hiệu Năng Mạng',3,2,'50%','CNTT','DCT'),
('841442',N'Mạng Đa Phương Tiện và Di Động',3,1,'50%','CNTT',null),
('841443',N'Phân TÍch Mạng Truyền Thông Xã Hội',3,2,'50%','CNTT','DCT'),
('841319',N'An Toàn Mạng Không Dây và Di Động',3,2,'50%','CNTT','DCT'),
('841444',N'Quản Trị và Bảo Trì Hệ Thống',3,2,'50%','CNTT','DCT'),
('841445',N'Hệ Thống Ảo và Khả Năng Mở Rộng Dữ Liệu',3,2,'50%','CNTT','DCT'),
('841446',N'Phân Tích và Xử Lý Ảnh',4,2,'50%','CNTT','DCT'),
('841447',N'Khai Thác Dữ Liệu và Ứng Dụng',4,2,'50%','CNTT','DCT'),
('841448',N'Xử Lý Ngôn Ngữ Tư Nhiên',4,2,'50%','CNTT','DCT'),
('841449',N'Nhập Môn Máy Học',4,2,'50%','CNTT','DCT'),
('841450',N'Nhập Môn Dữ Liệu Lớn',4,2,'50%','CNTT','DCT'),
('841451',N'Tính toán song song',3,2,'50%','CNTT','DCT'),
('841452',N'Tính Toán Thông Minh',3,2,'50%','CNTT','DCT'),
('841116',N'Đồ Họa Máy Tính',3,2,'50%','CNTT','DCT'),
('841453',N'Phân Tích và Nhận Dạng Mẫu',3,2,'50%','CNTT','DCT'),
('841454',N'Xử Lý Ảnh Nâng Cao',4,2,'50%','CNTT','DCT'),
('841455',N'Ngôn Ngữ Học Máy Tính',3,2,'50%','CNTT','DCT'),
('841456',N'Công Nghệ Tri Thức',4,2,'50%','CNTT','DCT'),
('841457',N'Học Sâu',4,2,'50%','CNTT','DCT'),
('841458',N'Trí Tuệ Nhân Tạo Nâng Cao',4,2,'50%','CNTT','DCT'),
('841052',N'Xây Dựng Phần Mềm Theo Mô Hình Phần Lớp',4,1,'50%','CNTT',null),
('841408',N'Kiểm Thử Phần Mềm',4,1,'50%','CNTT',null),
('841481',N'Thiết Kế Giao Diện',4,1,'50%','CNTT',null),
('841461',N'Nhập Môn Phát Triển Ứng Dụng Trên Thiết Bị Di Động',4,2,'50%','CNTT','DCT'),
('841464',N'Lập Trình Web và Ứng Dụng Nâng Cao',4,1,'50%','CNTT',null),
('841113',N'Phát Triển Phần Mềm Mã Nguồn Mở',3,1,'50%','CNTT',null),
('841320',N'Công Nghệ Internet of Things',3,1,'50%','CNTT',null),
('841323',N'Điện Toán Đám Mây',3,1,'50%','CNTT',null),
('841431',N'Quản Lý Dự Án Phần Mềm',4,1,'50%','CNTT',null),
('841467',N'Công Nghệ .NET',4,1,'50%','CNTT',null),
('841468',N'Công Nghệ J2EE',4,1,'50%','CNTT',null),
('841470',N'Tương Tác Người Máy',4,1,'50%','CNTT',null),
('841463',N'Phát Triển Ứng Dụng Trên Thiết Bị Di Động Nâng Cao',4,1,'50%','CNTT',null),
('841428',N'Nhập Môn An Toàn Thông Tin ',3,2,'50%','CNTT','DKP'),
('841462',N'Phát Triển Ứng Dụng Trên Thiết Bị Di Động',4,2,'50%','CNTT','DKP'),
('841477',N'Lập Trình Game',4,2,'50%','CNTT','DKP')


					-----======================		END		======================

					-----====================== Thêm ràng buộc ----======================

				-----======================  Ràng buộc cho bảng Sinh Viên ----======================
				
Alter table SINHVIEN 
add constraint FK_SV_MaNganh_NGANH_MaNganh foreign key (MaNganh) references NGANH(MaNganh),
constraint FK_SV_MATK_TAIKHOAN_MaTK foreign key (MaTK) references TAIKHOAN(MaTK)


				-----======================  Ràng buộc cho bảng Khoa ----======================
Alter table KHOA
add constraint FK_KHOA_MATK_TAIKHOAN_MaTK foreign key (MaTK) references TAIKHOAN(MaTK)

				-----======================  Ràng buộc cho bảng GiangVien ----======================
Alter table GIANGVIEN
add constraint FK_GiangVien_MATK_TAIKHOAN_MaTK foreign key (MaTK) references TAIKHOAN(MaTK)
	
				-----======================  Ràng buộc cho bảng Học Phần ----======================

Alter table HOCPHAN 
add constraint FK_HOCPHAN_MaNganh_NGANH_MaNganh foreign key(MaNganh) references NGANH(MaNganh),
constraint FK_HOCPHAN_MaKhoa_KHOA_MaKhoa foreign key(MaKhoa) references KHOA(MaKhoa)

				-----======================  Ràng buộc cho bảng Điều Kiện ----======================
Alter table DIEUKIEN
add constraint FK_DIEUKIEN_MaHP_HOCPHAN_MaHP foreign key (MaHP) references HOCPHAN(MaHP),
constraint FK_DIEUKIEN_MaHPTRUOC_HOCPHAN_MaHP foreign key (MaHP_Truoc) references HOCPHAN(MaHP)


				-----======================  Ràng buộc cho bảng Nhóm----======================
Alter table NHOM
add constraint FK_NHOM_MaGV_GIANGVIEN_MaGV foreign key(MaGV) references GIANGVIEN(MaGV),
constraint FK_NHOM_MaHP_HOCPHAN_MaHP foreign key(MaHP) references HOCPHAN(MaHP)

				-----======================  Ràng buộc cho bảng Kết Quả ----======================
Alter table KETQUA
add constraint FK_KETQUA_MaSV_SINHVIEN_MaSV foreign key (MaSV) references SINHVIEN(MaSV),
constraint FK_KETQUA_MaHP_NHOM_MaHP foreign key (MaHP,SoNhom,HocKy,Nam) references NHOM(MaHP,SoNhom,HocKy,Nam)

				-----======================  Ràng buộc cho bảng Ngành ----======================
Alter table NGANH 
add constraint FK_NGANH_MaKhoa_KHOA_MaKhoa foreign key (MaKhoa) references KHOA(MaKhoa)

				-----======================  Ràng buộc cho bảng Tài Khoản ----======================

Alter table TAIKHOAN 
add constraint FK_TAIKHOAN_MaNhomQuyen_NHOMQUYEN_MaNhomQuyen foreign key(MaNhomQuyen) references NHOMQUYEN(MaNhomQUyen)

				-----======================  Ràng buộc cho bảng NQ_CTQ ----======================
Alter table NQ_CTQ
add constraint FK_NQ_CTQ_MaNhomQUyen_NHONQUYEN_MaNhonQuyen foreign key(MaNhomQuyen) references NHOMQUYEN(MaNhomQuyen),
constraint FK_NQ_CTQ_MaQuyen_CHITIETQUYEN_MaQuyen foreign key(MaQuyen) references CHITIETQUYEN(MaQuyen)

