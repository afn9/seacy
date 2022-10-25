listBrg = []

ulang = 'YA'
while ulang =='YA' :
    print("Input data barang")
    kode = input('Kode Barang : ')
    namaBrg = input('Nama Barang : ')
    qty = input('Jumlah Barang : ')
    harga = input('Harga Barang : ')
    jumlah = int(qty) * int(harga)

    dictBrg = {
                'kode' : kode,
                'namaBrg' : namaBrg,
                'qty' : qty,
                'harga' : harga,
                'jumlah' : jumlah
            }
    
    listBrg.append(dictBrg)
    
    print(" ")
    ulang = input('Isi data lagi? (YA/TIDAK) ')
    print("====================================================")


print('{:^50}'.format('Data Barang'))
print('{0:10} {1:20} {2:10} {3:10} {4:10}'.format('kode',
'namaBarang','qty','harga','jumlah'))

for dictBrg in listBrg :
    print('{0:10} {1:20} {2:<10} {3:<10} {4:<10}'.format(dictBrg[
        'kode'],dictBrg['namaBrg'], dictBrg['qty'],dictBrg['harga'
        ],dictBrg['jumlah']))
